package rikkei.academy;

public class Calculator {
    public static String NextDayCalculator(int day, int month, int year){
        int nextDay = 0;
        int nextMonth = 0;
        int nextYear = 0;
        if (day == 28 && month==2 && year%4==0){
            nextDay = 29;
            nextMonth = month;
            nextYear = year;
            }
        else {
            nextDay = 1;
            nextMonth = month +1;
            nextYear = year;
        }
        if (day == 29 && month==2 && year%4==0){
            nextDay = 1;
            nextMonth = month +1;
            nextYear = year;
        }
        if (day>=1 && day <= 29 && month <=12 && month !=2){
            nextDay = day+1;
            nextMonth = month;
            nextYear = year;
        }
        if (day == 30 ){
          switch (month){
              case 4:
              case 6:
              case 9:
              case 11:
                  nextDay = 1;
                  nextMonth = month +1;
                  nextYear = year;
                  break;
              case 1:
              case 3:
              case 5:
              case 7:
              case 8:
              case 10:
              case 12:
                  nextDay = 31;
                  nextMonth = month ;
                  nextYear = year;
                  break;
              case 2:
                  System.out.println("không có ngày này");
              default:
                  break;
          }
        }
        if (day == 31 ){
            switch (month){
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("không có ngày này");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                    nextDay = 1;
                    nextMonth = month +1;
                    nextYear = year;
                    break;
                case 12:
                    nextDay = 1;
                    nextMonth = 1;
                    nextYear = year +1;
                    break;
                case 2:
                    System.out.println("không có ngày này");
                default:
                    break;
            }
        }
        if (day > 31 || month >12){
            System.out.println("không có ngày này");
        }
        return  nextDay +"/" + nextMonth + "/" + nextYear;
    }
}
