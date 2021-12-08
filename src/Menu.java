import javax.swing.*;



public class Menu {
	//Create the menu bar.
	public static JMenuBar newJMenuBar() {
		JMenuBar menuBar = new JMenuBar();

		//Add a JMenu
		JMenu starter = new JMenu("Starters");
		JMenu maincourse = new JMenu("Main Courses");
		JMenu desserts = new JMenu("Desserts"); 

		menuBar.add(starter);
		menuBar.add(maincourse);
		menuBar.add(desserts);

		// Now we want to fill each of the menus.
		// Starters. This is a simple Menu, with five MenuItems.

		JMenuItem chickensoup = new JMenuItem("Chicken Soup");
		JMenuItem tomatosoup = new JMenuItem("Tomato Soup");
		JMenuItem onionrings = new JMenuItem("12 Onion Rings");
		JMenuItem mozzsticks = new JMenuItem("6 Mozzarella Sticks");
		JMenuItem salad = new JMenuItem("Salad");

		starter.add(chickensoup);
		starter.add(tomatosoup);
		starter.add(onionrings);
		starter.add(mozzsticks);
		starter.add(salad);

		// Main Courses
		//Fish, Steak, Chicken, CheeseBurgers, Skillets, Sandwiches


		//Fish Menu
		JMenu Fish =  new JMenu("Grilled Choice of Fish");
		JMenuItem salmon = new JMenuItem("Grilled Atlantic Salmon");
		JMenuItem haddock = new JMenuItem("Grilled Haddock");
		JMenuItem tilapia = new JMenuItem("Grilled Tilapia");
		Fish.add(salmon);
		Fish.add(haddock);
		Fish.add(tilapia);

		//Chicken Menu
		JMenu Chicken =  new JMenu("Grilled 6oz Chicken Breast");
		JMenuItem chicken = new JMenuItem("Grilled Chicken");
		Chicken.add(chicken);

		//Burger Menu
		JMenu CheeseBurger = new JMenu("CheeseBurger");
		JMenuItem rareburg = new JMenuItem("Rare");
		JMenuItem medrareburg = new JMenuItem("Medium-Rare");
		JMenuItem mediumburg = new JMenuItem("Medium");
		JMenuItem medwellburg = new JMenuItem("Medium-Well");
		JMenuItem welldoneburg = new JMenuItem("Well-Done");
		CheeseBurger.add(rareburg);
		CheeseBurger.add(medrareburg);
		CheeseBurger.add(mediumburg);
		CheeseBurger.add(medwellburg);
		CheeseBurger.add(welldoneburg);

		//Steak menu
		JMenu Steak = new JMenu("8oz Sirloin Steak");
		JMenuItem raresteak = new JMenuItem("Rare");
		JMenuItem medraresteak = new JMenuItem("Medium-Rare");
		JMenuItem mediumsteak = new JMenuItem("Medium");
		JMenuItem medwellsteak = new JMenuItem("Medium-Well");
		JMenuItem welldonesteak = new JMenuItem("Well Done");
		Steak.add(raresteak);
		Steak.add(medraresteak);
		Steak.add(mediumsteak);
		Steak.add(medwellsteak);
		Steak.add(welldonesteak);

		//Skillet menu
		JMenu Skillets = new JMenu("Breakfast/Lunch/Dinner Skillets");
		JMenuItem countryskillet = new JMenuItem("Country Skillet");
		JMenuItem everythingskillet = new JMenuItem("Everything Skillet");
		JMenuItem steakskillet = new JMenuItem("Steak & Pepper Skillet");
		JMenuItem shrimpskillet = new JMenuItem("Shrimp Skillet");
		Skillets.add(countryskillet);
		Skillets.add(everythingskillet);
		Skillets.add(steakskillet);
		Skillets.add(shrimpskillet);

		//Sandwich menu
		JMenu Sandwiches = new JMenu("Sandwiches");
		JMenuItem BTLSandwich =  new JMenuItem("BLT Sandwich");
		JMenuItem TripleClubSandwich =  new JMenuItem("TripleClub Sandwich");
		JMenuItem ChickenTenderMelt =  new JMenuItem("Chicken Tender Melt");
		JMenuItem HamCheeseSandwich =  new JMenuItem("Ham & Cheese Sandwich");
		Sandwiches.add(BTLSandwich);
		Sandwiches.add(TripleClubSandwich);
		Sandwiches.add(ChickenTenderMelt);
		Sandwiches.add(HamCheeseSandwich);

		//Pie menu
		JMenuItem pie = new JMenuItem("Pie");
		
		//Sides menu

		ButtonGroup sides = new ButtonGroup();
		JRadioButtonMenuItem chips = new JRadioButtonMenuItem("Potato Chips");
		JRadioButtonMenuItem frenchfries = new JRadioButtonMenuItem("French Fries");
		JRadioButtonMenuItem bakedpotato = new JRadioButtonMenuItem("Baked Potato");
		JRadioButtonMenuItem vegetables = new JRadioButtonMenuItem("Grilled Vegetables");
		JRadioButtonMenuItem corn = new JRadioButtonMenuItem("Corn");
		JRadioButtonMenuItem greenbeans = new JRadioButtonMenuItem("Greenbeans");
		JRadioButtonMenuItem mashedpotatoes = new JRadioButtonMenuItem("Mashed Potatoes");


		sides.add(chips);
		sides.add(bakedpotato);
		sides.add(vegetables);
		sides.add(greenbeans);
		sides.add(corn);
		sides.add(frenchfries);
		sides.add(mashedpotatoes);

		maincourse.add(Fish);
		maincourse.add(Steak);
		maincourse.add(Chicken);
		maincourse.add(CheeseBurger);
		maincourse.add(Skillets);
		maincourse.add(Sandwiches);
		maincourse.add(pie);

		maincourse.addSeparator();

		maincourse.add(chips);
		maincourse.add(frenchfries);
		maincourse.add(bakedpotato);
		maincourse.add(vegetables);
		maincourse.add(mashedpotatoes);
		maincourse.add(corn);
		maincourse.add(greenbeans);



		// Desserts
		// This is to display the CheckBoxMenuItem


		JCheckBoxMenuItem sorbet = new JCheckBoxMenuItem("Sorbet");
		JMenu icecream = new JMenu("Ice Cream");
		JCheckBoxMenuItem choc = new JCheckBoxMenuItem("Chocolate");
		JCheckBoxMenuItem vani = new JCheckBoxMenuItem("Vanilla");
		icecream.add(choc);
		icecream.add(vani);

		desserts.add(sorbet);
		desserts.add(icecream);

		return menuBar;
		}
	
}

