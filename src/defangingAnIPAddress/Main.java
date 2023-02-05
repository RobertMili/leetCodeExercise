package defangingAnIPAddress;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String ipAdress = "1.1.1.1";
        solution.defengIPaddr(ipAdress);
    }
}

class Solution{
    public String defengIPaddr(String address){

        String newAddress = address.replaceAll("[.]","[.]");


        return newAddress;
    }
}
