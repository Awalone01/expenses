package pro.sky.expenses.service;

import org.springframework.stereotype.Service;
import pro.sky.expenses.entity.Expense;

import java.util.List;

@Service
public class ExpenseService {
    public List<Expense> getAllExpenses() {
        return List<Expense> ;
    }

    public void createExpense(Expense expense) {
    }

    public void deleteExpenseById(Integer id) {
    }
}
