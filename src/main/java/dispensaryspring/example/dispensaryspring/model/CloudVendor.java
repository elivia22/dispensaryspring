package dispensaryspring.example.dispensaryspring.model;


public class CloudVendor {

    private String VendorID;
    private String VendorName;
    private String VendorAddress;
    private String VendorPhoneNumber;

    public CloudVendor() {
    }

    public CloudVendor(String vendorID, String vendorName, String vendorAddress, String vendorPhoneNumber) {
        VendorID = vendorID;
        VendorName = vendorName;
        VendorAddress = vendorAddress;
        VendorPhoneNumber = vendorPhoneNumber;
        
    }

    public String getVendorID() {
        return VendorID;
    }

    public void setVendorID(String vendorID) {
        VendorID = vendorID;
    }

    public String getVendorName() {
        return VendorName;
    }

    public void setVendorName(String vendorName) {
        VendorName = vendorName;
    }

    public String getVendorAddress() {
        return VendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        VendorAddress = vendorAddress;
    }

    public String getVendorPhoneNumber() {
        return VendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        VendorPhoneNumber = vendorPhoneNumber;
    }

}
