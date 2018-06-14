package com.el.onboarding.junit.romanNumerals.services;

public class HinduToRomanNumeralConverter {
	
	private HinduToRoman[] map = {
			new HinduToRoman(1000, "M"),
			new HinduToRoman(900, "CM"),
			new HinduToRoman(500, "D"),
			new HinduToRoman(400, "CD"),
			new HinduToRoman(100, "C"),
			new HinduToRoman(90, "XC"),
			new HinduToRoman(50, "L"),
			new HinduToRoman(40, "XL"),
			new HinduToRoman(10, "X"),
			new HinduToRoman(9, "IX"),
			new HinduToRoman(5, "V"),
			new HinduToRoman(4, "IV"),
			new HinduToRoman(1, "I")
	};
	
	public String convert(int hindu) {
		String roman = "";
		
		for (int i = 0; i < map.length; i++) {
			while(hindu >= map[i].hinduNumeral) {
				roman += map[i].romanNumeral;
				hindu -= map[i].hinduNumeral;
			}
		}
		
		return roman;
	}
}
