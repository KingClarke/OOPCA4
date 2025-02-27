package Objects;
import Exception.DaoException;
import DAO.ExpensesDAO;
import DAO.IncomeDAO;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws DaoException {
        Scanner scanner = new Scanner(System.in);
        ExpensesDAO expensesDAO = new ExpensesDAO();
        IncomeDAO incomeDAO = new IncomeDAO();

        while (true) {
            System.out.println("Exit : 0");
            System.out.println("Income : 1");
            System.out.println("Expenses : 2");
            System.out.print("Choose an option:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("Record Management Menu:");
                    System.out.println("Show Income : 1");
                    System.out.println("Add Income : 2");
                    System.out.println("Delete Income : 3");
                    break;
                case 2:
                    System.out.println("Show Expenses: 4");
                    System.out.println("Add Expense: 5");
                    System.out.println("Delete Expense: 6");
                    break;
            }
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    incomeDAO.getAllIncome().forEach(System.out::println);
                    break;
                case 2:
                    System.out.print("Name of the income: ");
                    String title = scanner.nextLine();
                    System.out.print("Income: ");
                    double amount = scanner.nextDouble();
                    System.out.print("Date (YYYY-MM-DD): ");
                    String date = scanner.next();
                    incomeDAO.addIncome(title, amount, date);
                    break;
                case 3:
                    System.out.print("ID of the income you want to delete: ");
                    int id = scanner.nextInt();
                    incomeDAO.deleteIncome(id);
                    break;
                case 4:
                    expensesDAO.getAllExpenses().forEach(System.out::println);
                    break;
                case 5:
                    System.out.print("Name of the expense: ");
                    title = scanner.nextLine();
                    System.out.print("Category: ");
                    String category = scanner.nextLine();
                    System.out.print("Expense: ");
                    amount= scanner.nextDouble();
                    System.out.print("Date (YYYY-MM-DD): ");
                    date = scanner.next();
                    expensesDAO.addExpense(title, category, amount, date);
                    break;
                case 6:
                    System.out.print("ID of the expense you want to delete : ");
                    id = scanner.nextInt();
                    expensesDAO.deleteExpense(id);
                    break;
            }
        }
    }
}
