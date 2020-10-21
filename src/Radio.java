public class Radio {
    int volume = 0;
    boolean volumeUp = false;
    boolean volumeDown = false;


    public enum RadioState {
            ON,
            OFF
    }

    RadioState radioState = RadioState.OFF;

    public void ToggleRadioState() {
        if(radioState == RadioState.OFF) {
            radioState = RadioState.ON;
        }
        else if(radioState == RadioState.ON) {
            radioState = RadioState.OFF;
        }
        else {
            System.out.println("Error");
        }
    }

    public void VolumeUp(int volumeState, boolean action) {
        if(0 <= volumeState && volumeState <= 100 && action == true) {
            volumeState = volumeState + 5;
        }
        else {
            volumeState = volumeState;
        }
    }

    public void VolumeDown(int volumeState, boolean action) {
        if(0 <= volumeState && volumeState <= 100 && action == true) {
            volumeState = volumeState - 5;
        }
        else {
            volumeState = volumeState;
        }
    }
}







