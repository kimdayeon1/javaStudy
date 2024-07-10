//package com.yeon.myyjpa.phonebook;
//
//import com.yeon.myyjpa.cat.CategoryEntity;
//import com.yeon.myyjpa.cat.CategoryJpaRepository;
//import com.yeon.myyjpa.cat.ICategory;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.Optional;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//@SpringBootTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//
//public class MyyjpaApplicationTests {
//    @Autowired
//    private CategoryJpaRepository categoryJpaRepository;
//
//    @Test
//    public void CategoryInsertTest() {
//        CategoryEntity insert = CategoryEntity.builder()
//                .name("12345678912345678901").build();
//        Throwable exception = assertThrows(Exception.class, ()-> {
//            CategoryEntity insert2 = null;
//            categoryJpaRepository.save(insert2);
//        });
//        System.out.println(exception.toString());
//
//        CategoryEntity insert3 = CategoryEntity.builder()
//                .name("abcdef").build();
//        CategoryEntity resultInsert = categoryJpaRepository.save(insert3);
//        assertThat(resultInsert).isNotNull();
//        assertThat(resultInsert.getId()).isGreaterThan(0L);
//        assertThat(resultInsert.getName()).isEqualTo("abcdef");
//    }
//
//    @Test
//    public void CategoryFindTest() {
//        Optional<CategoryEntity> find1 = this.categoryJpaRepository.findById(0L);
//        assertThat(find1.orElse(null)).isNull();
//
//        Optional<CategoryEntity> find2 = this.categoryJpaRepository.findByName("abcdef");
//        ICategory find2Category = find2.orElse(null);
//        assertThat(find2Category).isNotNull();
//
//        Optional<CategoryEntity> find3 = this.categoryJpaRepository.findById(find2Category.getId());
//        ICategory find3Category = find3.orElse(null);
//        assertThat(find3Category).isNotNull();
//
//        assertThat(find2Category.getId()).isEqualTo(find3Category.getId());
//        assertThat(find2Category.getName()).isEqualTo(find3Category.getName());
//    }
//
//
//    @Test
//    public void CategoryUpdateTest() {
//        Optional<CategoryEntity> find1 = this.categoryJpaRepository.findByName("abcdef");
//        ICategory find1ICategory = find1.orElse(null);
//        assertThat(find1ICategory).isNotNull();
//
//        find1ICategory.setName("ABCDEF");
//        ICategory save = this.categoryJpaRepository.save((CategoryEntity) find1ICategory);
//
//        Optional<CategoryEntity> find2 = this.categoryJpaRepository.findById(save.getId());
//        ICategory find3ICategory = find2.orElse(null);
//        assertThat(find3ICategory).isNotNull();
//
//        assertThat(find3ICategory.getId()).isEqualTo(find1ICategory.getId());
//        assertThat(find3ICategory.getName()).isEqualTo(find1ICategory.getName());
//    }
//
//    @Test
//    public void CategoryDeleteTest() {
//        Optional<CategoryEntity> find1 = this.categoryJpaRepository.findByName("ABCDEF");
//        ICategory find1ICategory = find1.orElse(null);
//        assertThat(find1ICategory).isNotNull();
//
//        this.categoryJpaRepository.deleteById(find1ICategory.getId());
//
//        Optional<CategoryEntity> find2 = this.categoryJpaRepository.findById(find1ICategory.getId());
//        ICategory find2ICategory = find2.orElse(null);
//        assertThat(find2ICategory).isNull();
//    }
//
//}
//
//
