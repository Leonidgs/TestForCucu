package steps;
import io.cucumber.java.ru.Допустим;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import ru.appline.framework.managers.ManagerPages;

public class Steps {

    private ManagerPages app = ManagerPages.getManagerPages();

    @Когда("^Загружена стартовая страница$")
    public void getInitialPage(){
        app.getStartPage();
    }

    @Тогда("^Переход в главное меню '(.*)'$")
    public void selectNameBaseMenu(String nameBaseMenu){
        app.getStartPage().selectBaseMenu(nameBaseMenu);
    }

    @Допустим("^Выбираем подменю '(.*)'$")
    public void выбираем_подменю(String string) {
        app.getStartPage().selectSubMenu(string);
    }

    @Когда("Заполняем поле стоимость недвижимости {string}")
    public void заполняем_поле_Стоимость_недвижимости(String value) {
        app.mortgagePage().setPropertyValue(value);
    }

    @Допустим("Вводим первоначальный взнос {string}")
    public void вводим_Первоначальный_взнос(String value) {
        // Write code here that turns the phrase above into concrete actions
        app.mortgagePage().putFristMany(value);
    }

    @Допустим("Указываем срок кредита {string}")
    public void указываем_Срок_кредита(String value) {
        app.mortgagePage().setCreditTerm(value);
    }

    @Допустим("Проверяем выключенную опцию доп. страхование {string}")
    public void проверяем_выключенную_опцию_Страхование_жизни_и_здоровья(String value) {
        app.mortgagePage().offInssurens(value);
    }

    @Допустим("Проверяем включенную опцию молодая семья {string}")
    public void проверяем_включенную_опцию_Молодая_семья(String value) {
        app.mortgagePage().checkNewFamilyButton(value);
    }

    @Допустим("Проверяем сумму ежемесячного платежа {string}")
    public void проверяем_значение_Ежемесячного_платежа(String value) {
        app.mortgagePage().checkField(value);
    }

    @Допустим("Проверяем сумму кредита {string}")
    public void проверяем_Сумма_кредита(String value) {
       app.mortgagePage().checkFieldSumCredit(value);
    }

    @Допустим("Проверяем необходимый доход {string}")
    public void проверяем_Необходимый_доход(String value) {
        app.mortgagePage().chekRequiredIncome(value);
    }

    @Допустим("Проверяем процентную ставку {string}")
    public void проверяем_процентную_ставку(String value) {
        app.mortgagePage().chekCreditRate(value);
    }
}