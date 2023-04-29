fun main(args: Array<String>) {
	var escapedString: String = "I am escaped String!\n"
	var rawString: String = """This is going to be a
   multi-line string and will
   not have any escape sequence""";


	//Escaped string is declared within double quote (" ") and may contain escape characters like '\n', '\t', '\b' etc.
	print(escapedString)

	//Raw string is declared within triple quote (""" """) and may contain multiple lines of text without any escape characters.
	println(rawString)
	var name: String = "Vaibhav Mojidra"
	println(name[3])
	println(name[5])
	println("Length of strin: '" + name + "' : " + name.length)
	println("The length of name :" + name.count())
	println("The index of last character in name :" + name.lastIndex)
	println("Upper case of name :" + name.toUpperCase())
	println("Lower case of name :" + name.toLowerCase())

	var firstName: String = "Riya "
	var lastName: String = "Mojidra"

	println("Full Name : " + firstName + lastName)

	println("Full Name : " + firstName.plus(lastName))

	println("Remove first two characters from name : " + name.drop(2))

	println("Remove last two characters from name : " + name.dropLast(2))

	var str: String = "Meditation and Yoga are synonymous with India"

	println("Index of Yoga in the string - " + str.indexOf("Yoga"))

	var str1: String = "Apple"
	var str2: String = "Apple"

	println(str1.compareTo(str2))

	println(name.getOrNull(0))
	println(name.getOrNull(2))
	println(name.getOrNull(100))

}