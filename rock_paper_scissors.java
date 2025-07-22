import java.util.*;

public class rock_paper_scissors {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char rock = 'R';
        char paper = 'P';
        char scissors = 'S';
        boolean playagain = true;

        while (playagain) {
            Random rand = new Random();
            char[] options = { rock, paper, scissors };
            char compschoice = options[rand.nextInt(3)];

            System.out.println("Choose between Rock-Paper-Scissor(Use only R/P/S):  ");
            char human_chosen_option = sc.next().toUpperCase().charAt(0);

            if (compschoice == human_chosen_option) {
                System.out.println("It's a Tie.");
            } else if (
                (human_chosen_option == 'R' && compschoice == 'S') ||
                (human_chosen_option == 'P' && compschoice == 'R') ||
                (human_chosen_option == 'S' && compschoice == 'P')
                ) {
                System.out.println("You Won");
            } else {
                System.out.print("You lost, Playagain");
            }
            System.out.println("Play again? (Y/N): ");
            char again = sc.next().toUpperCase().charAt(0);
            if (again != 'Y') {
                playagain = false;
            }
        }

    }
}
