public class Main {
    static void main (){

        TV tv1 = new TV ();

        tv1.turnOn();

        tv1.setChannel(217);

        System.out.println("===== PANASONIC =====");
        System.out.println("Usted esta viendo el canal: " + tv1.getChannel());

        tv1.volumeUp();

        System.out.println("El volumen es de: " + tv1.getVolumeLevel());

        tv1.channelUP();
        System.out.println("Usted esta viendo el canal: " + tv1.getChannel());

        tv1.channelDown();
        System.out.println("Usted esta viendo el canal: " + tv1.getChannel());

        tv1.volumeDown();
        System.out.println("El volumen es de: " + tv1.getVolumeLevel());

    }
}
