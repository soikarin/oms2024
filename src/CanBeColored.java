public interface CanBeColored {

	default String setColor(String color) {
		if (color == null) {
			return "No color";
		}
		switch (color) {
			case "Blue":
			case "Green":
			case "Red":
			case "Yellow":
				return color;
			default:
				return "No color";
		}
	}

	String getColor();
}
