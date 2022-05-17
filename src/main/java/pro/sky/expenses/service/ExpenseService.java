package pro.sky.expenses.service;

import org.springframework.stereotype.Service;
import pro.sky.expenses.entity.Expense;
import pro.sky.expenses.repository.ExpenseRepository;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public void createExpense(Expense expense) {
        expenseRepository.save(expense);
    }

    public void deleteExpenseById(Integer id) {
        expenseRepository.delete(id);
    }
}
