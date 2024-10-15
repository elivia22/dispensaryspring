package dispensaryspring.example.dispensaryspring.controller;

import dispensaryspring.example.dispensaryspring.model.CloudVendor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendor")

public class CloudAPIService {

    @GetMapping("{vendorID}")
    public CloudVendor getCloudVendorDetails(String vendorID) {

        return new CloudVendor("VI", "TANESCO", "+255 677 7878", "GOBA");
    }
}
