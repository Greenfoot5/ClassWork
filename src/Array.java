public class Array
{
    public static void main(String[] args)
    {
        String[] names = new String[3];
        names[0] = "John";
        names[1] = "Barry";
        names[2] = "Bob";

        String[] namesTwo = {"Jeff", "Bobby","Notch"};

        System.out.print(names[0] + namesTwo[1]);

        String[][] allNames = new String [3][2];
        allNames[0] = names;
        allNames[1] = namesTwo;

        int i = 5;
        while (i >= 0)
        {
            System.out.println(i);
            System.out.print(allNames[(i)/3][(i) % 3] + "\n");
            i --;
        }

        String classesParents[][][] = {{{"Jo","Jerry"},{"Barry Sr.","Betta"},{"Builder","The"}},{{"Jerry","Janet"},{"Bar","Unknown"},{"Steve","Alex"}}};
        for (int j = 0; j < classesParents.length; j++) {
            for (int k = 0; k < classesParents[j].length; k++) {
                for (int l = 0; l < classesParents[j][k].length; l++) {
                    System.out.print(classesParents[j][k][l] + " and ");
                }
                System.out.print("\n");
            }
        }
    }
}
