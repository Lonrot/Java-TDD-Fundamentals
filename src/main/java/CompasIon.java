public class CompasIon {

    public static Compass.Point rotate(Compass.Point point, Compass.Direction direction){
        String returnPoint ="";
        String[] points = new String[4];
        points[0] = String.valueOf(Compass.Point.NORTH);
        points[1]= String.valueOf(Compass.Point.EAST);
        points[2]= String.valueOf(Compass.Point.SOUTH);
        points[3]= String.valueOf(Compass.Point.WEST);
        for (int i=0;i<4;i++){
            if (String.valueOf(point).equals(points[i])){
                if (direction == Compass.Direction.LEFT){
                    System.out.println("in Left");
                    if(i==0){
                        returnPoint = points[points.length-1];
                    }else{
                        returnPoint = points[i-1];
                    }
                }
                if(direction == Compass.Direction.RIGHT){
                    System.out.println("in RIght");
                    if(i == points.length-1){
                        System.out.println("in hard right");
                        returnPoint = points[0];
                    }else {
                        System.out.println("in simple right");
                        returnPoint = points[i+1];

                    }
                }
            }
        }


        System.out.println(returnPoint);

        return Compass.Point.valueOf(returnPoint);
    }
}
