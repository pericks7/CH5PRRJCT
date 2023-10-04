public class CarDoorConfiguration {
    private boolean securityLockActivated;
    private boolean childLockActivated;
    private boolean park;
    private boolean reverse;
    private boolean neutral;
    private boolean drive;
    private boolean openFromOutside;
    private boolean openFromDash;
    private boolean openfromInside;

    public CarDoorConfiguration(boolean securityStatus, boolean childStatus) {
        this.securityLockActivated = securityStatus;
        this.childLockActivated = childStatus;

    }

    public void setConfiguration(boolean securityStatus, boolean childStatus, String gearStatus) {
        this.securityLockActivated = securityStatus;
        this.childLockActivated = childStatus;
    }

    public String getStatus(String side, String source) {
        // Implement the logic to get the status based on side and source
        // You can return the status as a String here
        return "Status information based on side and source";}
    

    {
        
        if (childLockActivated == true) {
            openfromInside = false;
        }
        else{
            System.out.println("Cannot open doors from inside.  Child lock is engaged!");
        }

        if (openFromOutside == true) {
            securityLockActivated = false;
        }
        if (openfromInside == true) {
            childLockActivated=false;
        }
      

        if (securityLockActivated == true) {
            openFromOutside=false;
        }
        else {
            System.out.println("Cannot open doors from outside.  Security lock is engaged!");
        }
        if (openFromDash == true) {
             park=true;
             reverse=false;
            neutral=false;
             drive=false;
        }
             
     }
}

