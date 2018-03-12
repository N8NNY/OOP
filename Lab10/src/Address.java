public class Address {
    private String Plot, District, Provinece, PostalCode;

    public Address(String plot, String district, String provinece, String postalCode) {
        Plot = plot;
        District = district;
        Provinece = provinece;
        PostalCode = postalCode;
    }

    public Address() {

    }

    public String getPlot() {
        return Plot;
    }

    public void setPlot(String plot) {
        Plot = plot;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getProvinece() {
        return Provinece;
    }

    public void setProvinece(String provinece) {
        Provinece = provinece;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Plot='" + Plot + '\'' +
                ", District='" + District + '\'' +
                ", Provinece='" + Provinece + '\'' +
                ", PostalCode='" + PostalCode + '\'' +
                '}';
    }
}
