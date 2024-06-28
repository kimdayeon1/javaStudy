package com.yeon.sbt0628;

import com.yeon.sbt0628.make.PhoneBook;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConsoleApplication {
    private IPhoneBookService<IPhoneBook> phoneBookService;

    public void setPhoneBookService(IPhoneBookService<IPhoneBook> phoneBookService) throws Exception {
        this.phoneBookService = phoneBookService;
        this.phoneBookService.loadData();
    }

    public ConsoleApplication() {
    }

    public void printTitle() {
        System.out.println("============================================================================");
        System.out.println("1.연락처생성|2.목록|3.수정|4.삭제|5.이름검색|6.그룹검색|7.폰검색|8.이메일검색|9.종료");
        System.out.println("============================================================================");
    }

    public int getChoice(Scanner input) throws Exception {
        System.out.print("선택 > ");
        String a = input.nextLine();
        return Integer.parseInt(a);
    }

    public void printList() {
        this.printList(this.phoneBookService.getAllList());
    }

    private EPhoneGroup getRequiredGroupFromScanner(Scanner input, String title) {
        EPhoneGroup eGroup = null;
        boolean isValidInput = false;

        do {
            System.out.print(title + "연락처 그룹 {Friends(1), Families(2), Schools(3), Jobs(4), Hobbies(5)}: ");
            String group = input.nextLine();

            if (group.matches("[1-5]")) {
                switch (group) {
                    case "1":
                        eGroup = EPhoneGroup.Friends;
                        break;
                    case "2":
                        eGroup = EPhoneGroup.Families;
                        break;
                    case "3":
                        eGroup = EPhoneGroup.Schools;
                        break;
                    case "4":
                        eGroup = EPhoneGroup.Jobs;
                        break;
                    case "5":
                        eGroup = EPhoneGroup.Hobbies;
                        break;
                }
                isValidInput = true;
            } else {
                System.out.println("1에서 5 사이의 숫자를 입력하세요.");
            }
        } while (!isValidInput);

        return eGroup;
    }

    private EPhoneGroup getOptionalGroupFromScanner(Scanner input, String title, EPhoneGroup currentGroup) {
        EPhoneGroup eGroup = currentGroup;
        boolean isValidInput = false;

        do {
            System.out.print(title + "연락처 그룹 {Friends(1), Families(2), Schools(3), Jobs(4), Hobbies(5)} (기존 값 유지하려면 엔터): ");
            String group = input.nextLine();

            if (group.isEmpty()) {
                isValidInput = true; // 사용자가 엔터를 입력한 경우 기존 값 유지
            } else if (group.matches("[1-5]")) {
                switch (group) {
                    case "1":
                        eGroup = EPhoneGroup.Friends;
                        break;
                    case "2":
                        eGroup = EPhoneGroup.Families;
                        break;
                    case "3":
                        eGroup = EPhoneGroup.Schools;
                        break;
                    case "4":
                        eGroup = EPhoneGroup.Jobs;
                        break;
                    case "5":
                        eGroup = EPhoneGroup.Hobbies;
                        break;
                }
                isValidInput = true;
            } else {
                System.out.println("1에서 5 사이의 숫자를 입력하세요.");
            }
        } while (!isValidInput);

        return eGroup;
    }

    public void insert(Scanner input) throws Exception {
        System.out.println("--------");
        System.out.println("연락처 생성");
        System.out.println("--------");
        String name = getRequiredInput(input, "연락처 이름 : ");
        EPhoneGroup group = this.getRequiredGroupFromScanner(input, "");
        String phone = getRequiredNumericPhoneNumber(input);
        String email = getRequiredInput(input, "이메일 : ");

        if (this.phoneBookService.insert(name, group, phone, email)) {
            this.phoneBookService.saveData();
            System.out.println("결과: 데이터 추가 성공되었습니다.");
        }
    }

    private String getRequiredInput(Scanner input, String prompt) {
        String value;
        do {
            System.out.print(prompt);
            value = input.nextLine().trim();
            if (value.isEmpty()) {
                System.out.println("값을 입력하세요.");
            }
        } while (value.isEmpty());
        return value;
    }

    private String getRequiredNumericPhoneNumber(Scanner input) {
        String phone;
        do {
            phone = getRequiredInput(input, "전화번호 : ");
            if (!phone.matches("[0-9]+")) {
                System.out.println("전화번호는 숫자로만 입력해야 합니다.");
            }
        } while (!phone.matches("[0-9]+"));
        return phone;
    }

    public void update(Scanner input) throws Exception {
        IPhoneBook result = getFindIdConsole(input, "수정할");
        if (result == null) {
            System.out.println("에러: ID 데이터가 존재하지 않습니다.");
            return;
        }

        System.out.print("수정할 이름 (기존 값 유지: " + result.getName() + "): ");
        String name = input.nextLine().trim();
        if (name.isEmpty()) {
            name = result.getName();
        }

        EPhoneGroup group = this.getOptionalGroupFromScanner(input, "수정할 ", result.getGroup());

        System.out.print("수정할 전화번호 (기존 값 유지: " + result.getPhoneNumber() + "): ");
        String phone = input.nextLine().trim();
        if (phone.isEmpty()) {
            phone = result.getPhoneNumber();
        } else if (!phone.matches("[0-9]+")) {
            System.out.println("전화번호는 숫자로만 입력해야 합니다.");
            return;
        }

        System.out.print("수정할 이메일 (기존 값 유지: " + result.getEmail() + "): ");
        String email = input.nextLine().trim();
        if (email.isEmpty()) {
            email = result.getEmail();
        }

        IPhoneBook update = PhoneBook.builder()
                .id(result.getId()).name(name)
                .group(group)
                .phoneNumber(phone).email(email).build();

        if (this.phoneBookService.update(update.getId(), update)) {
            this.phoneBookService.saveData();
            System.out.println("결과: 데이터 수정 성공되었습니다.");
        }
    }

    public void delete(Scanner input) throws Exception {
        IPhoneBook result = getFindIdConsole(input, "삭제할");
        if (result == null) {
            System.out.println("에러: ID 데이터가 존재하지 않습니다.");
            return;
        }
        if (this.phoneBookService.remove(result.getId())) {
            this.phoneBookService.saveData();
            System.out.println("결과: 데이터 삭제 성공되었습니다.");
        } else {
            System.out.println("결과: 데이터 삭제 실패되었습니다.");
        }
    }

    private IPhoneBook getFindIdConsole(Scanner input, String title) {
        long id;
        do {
            System.out.print(title + " ID 번호: ");
            String idStr = input.nextLine().trim();
            try {
                id = Long.parseLong(idStr);
            } catch (NumberFormatException ex) {
                System.out.println("ID 번호를 숫자로만 입력하세요.");
                id = -1;
            }
        } while (id <= 0);
        return this.phoneBookService.findById(id);
    }

    private void printList(List<IPhoneBook> array) {
        array.forEach(System.out::println);
    }

    public void searchByName(Scanner input) {
        String name = getRequiredInput(input, "이름 : ");
        List<IPhoneBook> list = this.phoneBookService.getListFromName(name)
                .stream()
                .filter(pb -> pb.getName().toLowerCase().contains(name.toLowerCase()))  // 한 글자만 입력해도 검색 가능
                .collect(Collectors.toList());
        this.printList(list);
    }


    public void searchByGroup(Scanner input) {
        EPhoneGroup group = this.getRequiredGroupFromScanner(input, "찾을 ");
        List<IPhoneBook> list = this.phoneBookService.getListFromGroup(group)
                .stream()
                .filter(pb -> pb.getGroup() == group)
                .collect(Collectors.toList());
        this.printList(list);
    }

    public void searchByPhone(Scanner input) {
        String findPhone = getRequiredNumericPhoneNumber(input);
        List<IPhoneBook> list = this.phoneBookService.getListFromPhoneNumber(findPhone)
                .stream()
                .filter(pb -> pb.getPhoneNumber().startsWith(findPhone))
                .collect(Collectors.toList());
        this.printList(list);
    }

    public void searchByEmail(Scanner input) {
        String findEmail = getRequiredInput(input, " Email : ");
        List<IPhoneBook> list = this.phoneBookService.getListFromEmail(findEmail)
                .stream()
                .filter(pb -> pb.getEmail().startsWith(findEmail))
                .collect(Collectors.toList());
        this.printList(list);
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error: You need program arguments (-j/-t) (filename) !");
            return;
        }
    }
}
