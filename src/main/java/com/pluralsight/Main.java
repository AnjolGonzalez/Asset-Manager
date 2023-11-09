package com.pluralsight;
import java.text.DecimalFormat;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        assets.add(new House ("11/08/2023", "Angel's House", 250000, "2133 Belle Vernon Ave", 1, 2000, 350000));
        assets.add(new House ("11/08/2023", "Vacation Beach House", 500000, "1809 Self way", 2, 6000, 100000));
        assets.add(new Vehicle ("05/15/2023", "Angels car ", 15000, "Volkswagon Jetta", 2019, 28120));
        assets.add(new Vehicle ("09/23/2021", "Angels sister car ", 5000, "Jeep Wrangler", 2020, 115265));

        for (int i = 0;i < assets.size(); i++) {

            System.out.println("Description: " + assets.get(i).getDescription() + " | Date acquired: " +
                    assets.get(i).getDateAcquired() + " | Purchase price: " + assets.get(i).originalCost + "| Value: " +
                    decimalFormat.format(assets.get(i).value()));
            if (assets.get(i) instanceof House) {
                House home = (House) assets.get(i);
                System.out.println("My home is at " + home.getAddress());
            } else if (assets.get(i) instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) assets.get(i);
                System.out.println("My vehicle is a " + vehicle.getMakeModel() + " " + vehicle.getYear());
            }
        }
    }
}

