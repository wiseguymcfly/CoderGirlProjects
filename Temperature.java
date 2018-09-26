
public class Temperature {
    public static void main(String args[]) {
        int temp[][] = new int[4][7];
        // temp[2][3] = 81;

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


        for (int row = 0; row < 4; row++) {
            if (row == 0) {
                System.out.println("M  T  W  Th F  S  Su  ");
            }
            for (int column = 0; column < 7; column++) {
                System.out.print(temp[row][column] + " ");
            }
            System.out.println("\n");
        }

        //Averages
        double allAverage = 0;
        double monAverage = 0;
        double tuesAverage = 0;
        double wedAverage = 0;
        double thursAverage = 0;
        double friAverage = 0;
        double satAverage = 0;
        double sunAverage = 0;

        double allTotal = 0;
        double monTotal = 0;
        double tuesTotal = 0;
        double wedTotal = 0;
        double thursTotal = 0;
        double friTotal = 0;
        double satTotal = 0;
        double sunTotal = 0;

        double saAverage = 0;
        double tpAverage = 0;
        double taAverage = 0;
        double spAverage = 0;

        double saTotal = 0;
        double tpTotal = 0;
        double taTotal = 0;
        double spTotal = 0;

        for (int column = 0; column < 7; column++) {
            for (int row = 0; row < 4; row++) {
                allTotal = allTotal + temp[row][column];

                if (column == 0) {
                    monTotal = monTotal + temp[row][column];
                }
                if (column == 1) {
                    tuesTotal = tuesTotal + temp[row][column];
                }
                if (column == 2) {
                    wedTotal = wedTotal + temp[row][column];
                }
                if (column == 3) {
                    thursTotal = thursTotal + temp[row][column];
                }
                if (column == 4) {
                    friTotal = friTotal + temp[row][column];
                }
                if (column == 5) {
                    satTotal = satTotal + temp[row][column];
                }
                if (column == 6) {
                    sunTotal = sunTotal + temp[row][column];
                }
            }
        }

        for (int column = 0; column < 5; column++) {
            for (int row = 0; row < 7; row++) {
                if (row == 0) {
                    saTotal = saTotal + temp[row][column];
                }
                if (row == 1) {
                    tpTotal = tpTotal + temp[row][column];
                }
                if (row == 2) {
                    taTotal = taTotal + temp[row][column];
                }
                if (row == 3) {
                    spTotal = spTotal + temp[row][column];
                }
            }
        }

            monAverage = monTotal / 4;
            tuesAverage = tuesTotal / 4;
            wedAverage = wedTotal / 4;
            thursAverage = thursTotal / 4;
            friAverage = friTotal / 4;
            satAverage = satTotal / 4;
            sunAverage = sunTotal / 4;
            allAverage = allTotal / 28;
            saAverage = saTotal / 7;
            tpAverage = tpTotal/7;
            taAverage = taTotal/7;
            spAverage = spTotal/7;

            System.out.println("Monday Average " + monAverage + "");
            System.out.println("Tuesday Average " + tuesAverage + "");
            System.out.println("Wednesday Average " + wedAverage + "");
            System.out.println("Thursday Average " + thursAverage + "");
            System.out.println("Friday Average " + friAverage + "");
            System.out.println("Saturday Average " + satAverage + "");
            System.out.println("Sunday Average " + sunAverage + "");
            System.out.println("\n");
            System.out.println("7AM Average " + saAverage + "");
            System.out.println("3PM Average " + tpAverage + "");
            System.out.println("3AM Average " + taAverage + "");
            System.out.println("7PM Average " + spAverage + "");
            System.out.println("\n");
            System.out.println("Total Average " + allAverage + "");
        }
    }

