//<렌트회사에 자동차 빌려주기 ex>우버, 그런 상황에서의 요구사항은 무엇이 있는가>
//
//우버는 라이드헤일링(Ride-hailing) 또는 라이드셰어링(Ride-sharing) 회사로 분류됩니다.
//우버는 대부분의 차량을 소유하지 않으며, 개인 차량 소유자가 자신의 차량을 사용하여 서비스를 제공합니다.
//
//1. 차량 조건
//
//연식과 상태: 최신 모델이거나 적어도 5년 이내의 연식이어야 하며, 정기적으로 유지보수된 상태여야 합니다.
//청결도: 차량 내부 및 외부가 청결하게 유지되어야 합니다.
//안전 검사: 정기적인 안전 검사와 필요 시 수리를 받았는지 확인해야 합니다.
//
//2. 보험
//
//상업용 자동차 보험: 우버와 같은 차량 공유 서비스는 상업용 보험이 필요합니다. 운전 중 발생할 수 있는 모든 사고에 대해 충분히 보장되는 보험에 가입해야 합니다.
//추가 보험: 우버에서 요구하는 추가 보험 요구사항을 확인하고 충족해야 합니다.
//
//3. 차량 등록 및 라이선스
//
//상업용 등록: 차량은 상업용으로 등록되어야 합니다.
//운전자 라이선스: 운전자가 적절한 라이선스를 보유하고 있는지 확인해야 합니다. 우버는 일반적으로 특정 연령과 운전 경력을 요구합니다.
//
//4. 차량 관리
//
//정기 점검: 차량은 정기적으로 점검 및 수리를 받아야 합니다. 이에는 타이어, 브레이크, 엔진 오일 교체 등이 포함됩니다.
//연비 관리: 연료 효율성이 높은 차량이 선호됩니다.
//
//5. 계약서 및 규정
//
//계약서 작성: 렌트 회사와 우버 운전자 간의 명확한 계약서가 필요합니다. 여기에는 사용 조건, 책임 분담, 유지보수 규정 등이 포함됩니다.
//규정 준수: 우버의 모든 규정을 준수해야 하며, 관련 법률과 규제에 따라야 합니다.
//
//6. 기타 요구사항
//
//GPS 설치: 실시간 위치 추적을 위한 GPS 장치가 설치되어 있어야 합니다.
//결제 시스템: 우버와의 결제 시스템이 원활하게 운영될 수 있도록 준비해야 합니다.
//비상 키트: 차량에 비상 키트(예: 응급처치 키트, 소화기 등)를 구비해야 합니다.

package com.sbmavenwep.demo2.mathexam;

import java.util.Scanner;

public class Car {
    private int year;
    private boolean isClean;
    private boolean hasInsurance;
    private boolean isCommercial;
    private boolean hasRegularMaintenance;
    private boolean hasContract;
    private boolean followsRegulations;
    private boolean hasGps;
    private boolean highFuelEfficiency;
    private boolean hasEmergencyKit;

    public Car(int year, boolean isClean, boolean hasInsurance, boolean isCommercial, boolean hasRegularMaintenance,
               boolean hasContract, boolean followsRegulations, boolean hasGps, boolean highFuelEfficiency, boolean hasEmergencyKit) {
        this.year = year;
        this.isClean = isClean;
        this.hasInsurance = hasInsurance;
        this.isCommercial = isCommercial;
        this.hasRegularMaintenance = hasRegularMaintenance;
        this.hasContract = hasContract;
        this.followsRegulations = followsRegulations;
        this.hasGps = hasGps;
        this.highFuelEfficiency = highFuelEfficiency;
        this.hasEmergencyKit = hasEmergencyKit;
    }

    public String calculateGrade() {
        int currentYear = 2024;

        // 연식 조건 검사
        if (currentYear - year >= 5) {
            return "연식 5년 이내여야 합니다.";
        }

        // 필수 조건 검사
        if (!isClean || !hasInsurance || !isCommercial || !hasRegularMaintenance ||
                !hasContract || !followsRegulations || !hasGps) {
            return "필수 조건을 만족하지 못했습니다. F 등급입니다.";
        }

        // 등급 계산
        if (highFuelEfficiency && hasEmergencyKit) {
            return "A";
        } else if (hasEmergencyKit) {
            return "B";
        } else {
            return "C";
        }
    }

    public void printConditions() {
        System.out.println("조건 평가:");
        System.out.println("연식 5년 이내(필수): " + (year >= 2020 ? "T" : "F"));
        System.out.println("청결(필수): " + (isClean ? "T" : "F"));
        System.out.println("보험 가입(필수): " + (hasInsurance ? "T" : "F"));
        System.out.println("상업용 등록(필수): " + (isCommercial ? "T" : "F"));
        System.out.println("정기 점검(필수): " + (hasRegularMaintenance ? "T" : "F"));
        System.out.println("계약서 작성(필수): " + (hasContract ? "T" : "F"));
        System.out.println("규정 준수(필수): " + (followsRegulations ? "T" : "F"));
        System.out.println("GPS 장착(필수): " + (hasGps ? "T" : "F"));
        System.out.println("연비 높은 차량(추가): " + (highFuelEfficiency ? "T" : "F"));
        System.out.println("비상 키트 구비(추가): " + (hasEmergencyKit ? "T" : "F"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자 입력을 통해 차량 정보를 설정합니다.
        int year = 0;
        boolean isClean = false;
        boolean hasInsurance = false;
        boolean isCommercial = false;
        boolean hasRegularMaintenance = false;
        boolean hasContract = false;
        boolean followsRegulations = false;
        boolean hasGps = false;
        boolean highFuelEfficiency = false;
        boolean hasEmergencyKit = false;

        // 연식 입력
        while (true) {
            System.out.println("차량 연식을 입력하세요 (년도로 입력, 2019년 이후):");
            year = scanner.nextInt();
            if (year >= 2019) {
                break;
            }
            System.out.println("연식은 2019년 이후만 입력 가능합니다. 다시 입력해주세요.");
        }

        // 청결 여부 입력
        while (true) {
            System.out.println("청결 여부를 입력하세요 (T/F):");
            String cleanInput = scanner.next();
            if (cleanInput.equalsIgnoreCase("T")) {
                isClean = true;
                break;
            } else if (cleanInput.equalsIgnoreCase("F")) {
                isClean = false;
                System.out.println("필수 조건을 만족하지 못했습니다. F 등급입니다.");
                return; // 프로그램 종료
            } else {
                System.out.println("올바른 형식으로 입력해주세요. (T/F)");
            }
        }

        // 보험 가입 여부 입력
        while (true) {
            System.out.println("보험 가입 여부를 입력하세요 (T/F):");
            String insuranceInput = scanner.next();
            if (insuranceInput.equalsIgnoreCase("T")) {
                hasInsurance = true;
                break;
            } else if (insuranceInput.equalsIgnoreCase("F")) {
                hasInsurance = false;
                System.out.println("필수 조건을 만족하지 못했습니다. F 등급입니다.");
                return; // 프로그램 종료
            } else {
                System.out.println("올바른 형식으로 입력해주세요. (T/F)");
            }
        }

        // 상업용 등록 여부 입력
        while (true) {
            System.out.println("상업용 등록 여부를 입력하세요 (T/F):");
            String commercialInput = scanner.next();
            if (commercialInput.equalsIgnoreCase("T")) {
                isCommercial = true;
                break;
            } else if (commercialInput.equalsIgnoreCase("F")) {
                isCommercial = false;
                System.out.println("필수 조건을 만족하지 못했습니다. F 등급입니다.");
                return; // 프로그램 종료
            } else {
                System.out.println("올바른 형식으로 입력해주세요. (T/F)");
            }
        }

        // 정기 점검 여부 입력
        while (true) {
            System.out.println("정기 점검 여부를 입력하세요 (T/F):");
            String maintenanceInput = scanner.next();
            if (maintenanceInput.equalsIgnoreCase("T")) {
                hasRegularMaintenance = true;
                break;
            } else if (maintenanceInput.equalsIgnoreCase("F")) {
                hasRegularMaintenance = false;
                System.out.println("필수 조건을 만족하지 못했습니다. F 등급입니다.");
                return; // 프로그램 종료
            } else {
                System.out.println("올바른 형식으로 입력해주세요. (T/F)");
            }
        }

        // 계약서 작성 여부 입력
        while (true) {
            System.out.println("계약서 작성 여부를 입력하세요 (T/F):");
            String contractInput = scanner.next();
            if (contractInput.equalsIgnoreCase("T")) {
                hasContract = true;
                break;
            } else if (contractInput.equalsIgnoreCase("F")) {
                hasContract = false;
                System.out.println("필수 조건을 만족하지 못했습니다. F 등급입니다.");
                return; // 프로그램 종료
            } else {
                System.out.println("올바른 형식으로 입력해주세요. (T/F)");
            }
        }

        // 규정 준수 여부 입력
        while (true) {
            System.out.println("규정 준수 여부를 입력하세요 (T/F):");
            String regulationsInput = scanner.next();
            if (regulationsInput.equalsIgnoreCase("T")) {
                followsRegulations = true;
                break;
            } else if (regulationsInput.equalsIgnoreCase("F")) {
                followsRegulations = false;
                System.out.println("필수 조건을 만족하지 못했습니다. F 등급입니다.");
                return; // 프로그램 종료
            } else {
                System.out.println("올바른 형식으로 입력해주세요. (T/F)");
            }
        }

        // GPS 장착 여부 입력
        while (true) {
            System.out.println("GPS 장착 여부를 입력하세요 (T/F):");
            String gpsInput = scanner.next();
            if (gpsInput.equalsIgnoreCase("T")) {
                hasGps = true;
                break;
            } else if (gpsInput.equalsIgnoreCase("F")) {
                hasGps = false;
                System.out.println("필수 조건을 만족하지 못했습니다. F 등급입니다.");
                return; // 프로그램 종료
            } else {
                System.out.println("올바른 형식으로 입력해주세요. (T/F)");
            }
        }

        // 연비 높은 차량 여부 입력
        while (true) {
            System.out.println("연비 높은 차량 여부를 입력하세요 (T/F):");
            String fuelEfficiencyInput = scanner.next();
            if (fuelEfficiencyInput.equalsIgnoreCase("T")) {
                highFuelEfficiency = true;
                break;
            } else if (fuelEfficiencyInput.equalsIgnoreCase("F")) {
                highFuelEfficiency = false;
                break; // 추가 조건이므로 다음으로 넘어감
            } else {
                System.out.println("올바른 형식으로 입력해주세요. (T/F)");
            }
        }

        // 비상 키트 구비 여부 입력
        while (true) {
            System.out.println("비상 키트 구비 여부를 입력하세요 (T/F):");
            String emergencyKitInput = scanner.next();
            if (emergencyKitInput.equalsIgnoreCase("T")) {
                hasEmergencyKit = true;
                break;
            } else if (emergencyKitInput.equalsIgnoreCase("F")) {
                hasEmergencyKit = false;
                break; // 추가 조건이므로 다음으로 넘어감
            } else {
                System.out.println("올바른 형식으로 입력해주세요. (T/F)");
            }
        }

        scanner.close();

        // 차량 객체를 생성합니다.
        Car car = new Car(year, isClean, hasInsurance, isCommercial, hasRegularMaintenance, hasContract,
                followsRegulations, hasGps, highFuelEfficiency, hasEmergencyKit);

        // 조건들을 출력합니다.
        car.printConditions();

        // 차량의 등급을 계산하고 출력합니다.
        String grade = car.calculateGrade();
        System.out.println("최종 등급: " + grade);
    }
}


