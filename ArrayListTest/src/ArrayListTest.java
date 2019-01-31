import java.util.ArrayList;

public class ArrayListTest{
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(10);
        grades.add(20);
        grades.add(30);
        grades.add(40);
        grades.add(50);
        grades.add(60);
        grades.remove(2);

        for(int i = 0; i<grades.size(); i++){
            System.out.printf("Grade %d = %d\n",(i+1), grades.get(i));
        }
    }
}