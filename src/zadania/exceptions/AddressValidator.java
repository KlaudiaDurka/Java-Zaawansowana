package zadania.exceptions;

public class AddressValidator {

    public void valid(Address address) throws AddressNotValidException {

        if (address == null || address.getCity() == null) {
            throw new AddressNotValidException();
        }
        System.out.println("Address jest poprawny");
    }

    public static void main(String[] args) throws AddressNotValidException {
        Address address = null;
        new AddressValidator().valid(address);
    }
}
