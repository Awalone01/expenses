package pro.sky.expenses.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.sky.expenses.entity.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {
    void delete(Integer id);
}
