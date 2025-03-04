// A class definition (user-defined type) that represents an IPod device
public class IPod {

    // Instance variables (state)
    private String currentSong;
    private int volume;
    private double batteryLife;
    private boolean powerStateOn;

    // constants
    private final double MAX_BATTERY = 100.0;
    private final double MAX_VOLUME = 100;

    // Default (empty) constructor
    public IPod() {
        this.currentSong = "";
        this.volume = 0;
        this.batteryLife = 100.0;
        this.powerStateOn = false;
    }

    // Parameterized constructor
    public IPod(String song, int volume, double batteryLife) {
        currentSong = song;
        this.volume = volume;
        this.batteryLife = batteryLife;
        this.powerStateOn = false;
    }

    /**
     * Changes the currentSong to the provided song.
     *
     * @param song (String) next song to be played.
     */
    public void changeSong(String song) {
        this.currentSong = song;
    }

    /**
     * Changes the volument to the provided volume up to 100 or down to 0.
     *
     * @param volume (int) volume level to set
     */
    public boolean changeVolume(int volume) {
        if (volume > 0 && volume <= MAX_VOLUME) {
            this.volume = volume;
            return true;
        }
        return false;
    }

    /**
     * Power OFF the IPod
     */
    public void powerOff() {
        powerStateOn = false;
    }

    /**
     * Power ON the IPod
     */
    public void powerOn() {
        powerStateOn = true;
    }

    /**
     * Will call method increaseBattery until fully charged.
     */
    public void chargeBattery() {
        while (batteryLife < MAX_BATTERY) {
            increaseBattery();
        }
    }

    /**
     * Will increase battery by 1.0 up to MAX_BATTERY
     *
     * @return true if increaseBattery was successful, false otherwise
     */
    private boolean increaseBattery() {
        return increaseBattery(1.0);
    }

    /**
     * Will decrease battery by 1.0 down to 0.0
     *
     * @return true if increaseBattery was successful, false otherwise
     */
    // private boolean decreaseBattery() {
    // return increaseBattery(-1.0);
    // }

    /**
     * Will increase battery by specified amount up to MAX_BATTERY,
     * or decrease as low as 0.0.
     * NOTE: Negative values of amount will decrease battery.
     *
     * @param amount (double) - the amount to increase/decrease battery life.
     * @return true if increaseBattery was successful, false otherwise
     */
    private boolean increaseBattery(double amount) {
        double newValue = batteryLife + amount;

        if (newValue > 0.0 && newValue <= MAX_BATTERY) {
            batteryLife += newValue;
            return true;
        }

        return false;
    }

    /**
     * Override the toString method to return IPod state for printing.
     */
    public String toString() {
        if (this.powerStateOn) {
            return String.format("song = \"%s\"\nvolume = %d\nbattery life = %.2f\n",
                    this.currentSong, this.volume, this.batteryLife);
        } else {
            return "IPod turned off.";
        }
    }
}
