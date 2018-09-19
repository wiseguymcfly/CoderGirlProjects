import static java.lang.System.out;
//average is sum of numbers divided by # of numbers


public class Temperature {
    public static void main(String[] args) {
        //int[][] temp = {
              //  {68, 70, 76, 70, 68, 71, 75},
                //{76, 76, 87, 84, 82, 75, 83},
                //{73, 72, 81, 78, 76, 73, 77},
                //{64, 65, 69, 68, 70, 74, 72},
        //};

        int[][] temp = new int[4][7];

        temp[0][0] = 68;
        temp[1][0] = 76;
        temp[2][0] = 73;
        temp[3][0] = 64;

        temp[0][1] = 70;
        temp[1][1] = 76;
        temp[2][1] = 72;
        temp[3][1] = 65;

        temp[0][2] = 76;
        temp[1][2] = 87;
        temp[2][2] = 81;
        temp[3][2] = 69;

        temp[0][3] = 70;
        temp[1][3] = 84;
        temp[2][3] = 78;
        temp[3][3] = 68;

        temp[0][4] = 68;
        temp[1][4] = 82;
        temp[2][4] = 76;
        temp[3][4] = 70;

        temp[0][5] = 71;
        temp[1][5] = 75;
        temp[2][5] = 73;
        temp[3][5] = 74;

        temp[0][6] = 75;
        temp[1][6] = 83;
        temp[2][6] = 77;
        temp[3][6] = 72;

        int[] time = new int [4];
        time[0] = 7;
        time[1] = 3;
        time[2] = 7;
        time[3] = 3;



        out.println("Temperature Calculator\n");
        for (int row = 0; row < 4; row++) {
            out.println("");
            if (row == 0){
                out.println("M  T  W  Th  F  S Su ");
            }

            for (int column = 0; column < 7; column++) {
                    out.print(temp[row][column] + " ");
            }

            //out.println(sum/temp[row].length);
        }


        out.println("\n");
        //first column
        double average = ((temp[0][0] + temp[0][1] + temp[0][2] + temp[0][3])/4);
        out.println("Mon Average " +average+"");
        //second column
        average = 0;
        average = ((temp[0][1] + temp[1][1] + temp[2][1] + temp[3][1])/4);
        out.println("Tues Average " +average+"");
        //third column
        average = ((temp[0][2] + temp[1][2] + temp[2][2] + temp[3][2])/4);
        out.println("Wed Average " +average+"");
        //four column
        average = ((temp[0][3] + temp[1][3] + temp[2][3] + temp[3][3])/4);
        out.println("Thurs Average " +average+"");
        //fifth column
        average = ((temp[0][4] + temp[1][4] + temp[2][4] + temp[3][4])/4);
        out.println("Fri Average " +average+"");
        //sixth column
        average = ((temp[0][5] + temp[1][5] + temp[2][5] + temp[3][5])/4);
        out.println("Sat Average " +average+"");
        //seventh column
        average = ((temp[0][6] + temp[1][6] + temp[2][6] + temp[3][6])/4);
        out.println("Sun Average " +average+"");
        //
        out.println("\n");
        average = ((temp[0][0] + temp[0][1] + temp[0][2] + temp[0][3] + temp[0][4] + temp[0][5] + temp[0][6])/7);
        out.println("7:00AM Average " +average+"");
        average = ((temp[1][0] + temp[1][1] + temp[1][2] + temp[1][3] + temp[1][4] + temp[1][5] + temp[1][6])/7);
        out.println("3:00PM Average " +average+"");
        average = ((temp[2][0] + temp[2][1] + temp[2][2] + temp[2][3] + temp[2][4] + temp[2][5] + temp[2][6])/7);
        out.println("7:00PM Average " +average+"");
        average = ((temp[3][0] + temp[3][1] + temp[3][2] + temp[3][3] + temp[3][4] + temp[3][5] + temp[3][6])/7);
        out.println("3:00AM Average " +average+"");



        }
    }
