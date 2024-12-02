/*
Un programa que muestra los grados de una lista dibujado con almohadillas
19-11-2024 16:45
David Bernal
*/
public class supuesto2_2{
    public static void main(String[]args){
    int []array={8,-3,15,-10,0,-25,-7,23};//Todos las temperaturas
    final int MINIMO=-20;//Minimo de la temperatura
    final int MAXIMO=20;//Maximo de temperatura
        
    
    
    for(int i=0;i<array.length;i++){
            if(array[i]>MAXIMO||array[i]<MINIMO){
        System.out.println(array[i]+" Esta fuera de rango");//Si esta fuera del rango avisa al usuario
    int dato=array[i];
    int margenizquierdo=(dato-MINIMO);//Calcula el margen entre de la almohadillas
    final char CARACTER='#';
    System.out.println("");
    }else{
       /* for(int j=0;j<dato;j++){
        System.out.print(margenizquierdo);
    }*/
    }

    }




        
    }
}
