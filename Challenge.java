package V_Camp;

public class Challenge {
    public static String sevenBoom(int[] arr) {

        char verifica = '7';

        for (int i = 0; i < arr.length; i++) {
            //Converte o int[i] em String e cria um array de chars com base na String
            char [] digitos = String.valueOf(arr[i]).toCharArray();

            //Varre o array de chars procurando pelo 7
            for (char d : digitos) {
                if(d == verifica)
                    return "Boom!";
            }
        }
        return "there is no 7 in the array";
    }
}