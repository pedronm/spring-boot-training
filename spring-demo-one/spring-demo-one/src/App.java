import com.luv2code.springdemo.BaseballCoach;
import com.luv2code.springdemo.ICoach;

public class App {
    public static void main(String[] args) throws Exception {
        ICoach coach = new BaseballCoach();

        System.out.println(coach.getDailyWorkout());
    }
}
