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
                    if(i==0){
                        returnPoint = points[points.length-1];
                    }else{
                        returnPoint = points[i-1];
                    }
                }
                if(direction == Compass.Direction.RIGHT){
                    if(i == points.length-1){
                        returnPoint = points[0];
                    }else {
                        returnPoint = points[i++];
                    }
                }
            }
        }

        Compass.Point ret = Compass.Point.valueOf(returnPoint);
        return ret;
    }
}
