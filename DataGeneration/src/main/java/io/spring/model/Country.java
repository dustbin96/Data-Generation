package io.spring.model;

public class Country {

	private Long id;

	private enum countryName {
		ANDORRA("Andorra"), UNITED_ARAB_EMIRATES("United Arab Emirates"), AFGHANISTAN("Afghanistan"),
		ANTIGUA_AND_BARBUDA("Antigua and Barbuda"), ANGUILLA("Anguilla"), ALBANIA("Albania"), ARMENIA("Armenia"),
		NETHERLANDS_ANTILLES("Netherlands Antilles"), ANGOLA("Angola"), ANTARCTICA("Antarctica"),
		ARGENTINA("Argentina"), AMERICAN_SAMOA("American Samoa"), AUSTRIA("Austria"), AUSTRALIA("Australia"),
		ARUBA("Aruba"), AZERBAIJAN("Azerbaijan"), BOSNIA_AND_HERZEGOVINA("Bosnia and Herzegovina"),
		BARBADOS("Barbados"), BANGLADESH("Bangladesh"), BELGIUM("Belgium"), BURKINA_FASO("Burkina Faso"),
		BULGARIA("Bulgaria"), BAHRAIN("Bahrain"), BURUNDI("Burundi"), BENIN("Benin"), BERMUDA("Bermuda"),
		BRUNEI("Brunei"), BOLIVIA("Bolivia"), BRAZIL("Brazil"), BAHAMAS("Bahamas"), BHUTAN("Bhutan"),
		BOUVET_ISLAND("Bouvet Island"), BOTSWANA("Botswana"), BELARUS("Belarus"), BELIZE("Belize"),
		CANADA("Canada");

		countryName(String string) {
			// TODO Auto-generated constructor stub
		}
	}

}
