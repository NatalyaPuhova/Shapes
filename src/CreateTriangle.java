public class CreateTriangle {

    public  int [][] createTrianglePoints(){
        int [][] array=new int[2][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<2;j++){
                array [j][i]=(int)(Math.random()*12);
                System.out.println("array ["+j+"]["+i+"]"+array [j][i]);
            }
        }



        return array;
    }
    public boolean checkPoints(int [][] array){
        double d1=Math.pow(array[0][1]-array[0][0],2)+Math.pow(array[1][1]-array[1][0],2);
        double d2=Math.pow(array[0][2]-array[0][1],2)+Math.pow(array[1][2]-array[1][1],2);
        double d3=Math.pow(array[0][2]-array[0][0],2)+Math.pow(array[1][2]-array[1][0],2);
        if (Math.sqrt(d1)+Math.sqrt(d2)>Math.sqrt(d3)&&Math.sqrt(d1)+Math.sqrt(d3)>Math.sqrt(d2)&&Math.sqrt(d3)+Math.sqrt(d2)>Math.sqrt(d1)){
            return true;
        }
        else return false;

    }



    /*public int checkTriangle(int a, int b){

    }

     */

}
