This is a text-based adventure game that runs entirely in the terminal. You create a character, roll for your stats, and then make choices that decide how the story unfolds. Some choices will help you. Others will get you killed.
The project started as a way to refresh my Java knowledge, so the code is deliberately plain and readable, and it's being built up one feature at a time.

Current features:
Character creation: name your hero (with a confirmation step) and roll for Skill, Health and Luck
Your dice or mine: roll physical dice and type in the results, or let the game roll virtually
Branching story: your choices change what happens next, including a game over if you choose badly
Inventory system: items are built on an Item base class, with Weapon and Potion as subclasses
Equipped weapon tracking: every weapon you pick up goes in your inventory, and the one in use is marked (Currently Equipped). Only the equipped weapon adds its bonus to your Skill
Input validation: invalid story choices are caught and the question is asked again
Status screen: shows your stats, gold, provisions, inventory and equipped weapon at any time
<p align="right">(<a href="#readme-top">back to top</a>)</p>

Built With
Java
<p align="right">(<a href="#readme-top">back to top</a>)</p>
How It Works
Stats are generated with dice, in the style of classic gamebooks:
Stat	Roll	Formula	Range
Skill	1 die	roll + 6	7-12
Health	2 dice	roll + 12	14-24
Luck	1 die	roll + 6	7-12
Weapons add their addedSkill bonus to your Skill, but only while equipped. An unarmed player simply has a weapon with an empty name and a bonus of 0.
<p align="right">(<a href="#readme-top">back to top</a>)</p> <!-- GETTING STARTED -->
Getting Started
To get a local copy up and running, follow these steps.
Prerequisites
You need a Java Development Kit (JDK) installed. Check by running:
sh
java -version
javac -version
If either command isn't found, download a JDK from adoptium.net or your preferred vendor.
Installation
Clone the repo
sh
   git clone https://github.com/your_username/your_repo_name.git
Move into the project folder
sh
   cd your_repo_name
Compile all the source files
sh
   javac *.java
Run the game
sh
   java Game
<p align="right">(<a href="#readme-top">back to top</a>)</p> <!-- USAGE -->
Usage
The game is played by typing at the prompts and pressing Enter.
Enter your name and confirm it with y
Choose how to roll your stats: p for physical dice, r to let the game roll
Make your choices in the story by typing the letter shown (e.g. a or b)
Example of the opening scene:
text
You awaken in a cold sweat. You look around and see that you're in a small wooden hut...
What do you do?
a). To open the wardrobe
b). To open the front door
And a taste of the status screen once you've found some gear:
text
Your inventory:
- Sword (Currently Equipped)
- a Potion of Healing
You have Sword equipped (This adds +1 skill in combat)
Be careful what you open. Not every door leads somewhere nice.
<p align="right">(<a href="#readme-top">back to top</a>)</p> <!-- PROJECT STRUCTURE -->
Project Structure
File	Purpose
Game.java	Entry point (main). Runs character creation, then the story
CharacterCreation.java	Name entry and stat rolling (physical or virtual dice)
Character.java	The player: stats, gold, provisions, inventory, equipped weapon
Item.java	Base class for everything you can carry (has a name)
Weapon.java	Extends Item, adds an addedSkill combat bonus
Potion.java	Extends Item, adds a statChangeValue
Story.java	The story scenes and the choices the player makes
Misc.java	Small helper output, such as the "character created" summary
<p align="right">(<a href="#readme-top">back to top</a>)</p> <!-- ROADMAP -->
Roadmap
 Character creation with physical or virtual dice
 Status screen
 Item system using inheritance (Item, Weapon, Potion)
 Equipped weapon marker in the inventory
 Story choice validation
 Game over on death
 Use potions (restore health and remove the potion from the inventory)
 Combat system using Skill, Luck and weapon bonuses
 More story scenes and branching paths
 Equip and swap weapons from the inventory
 Validate dice input in character creation (non-numeric entries currently crash it)
 Share a single Scanner across all classes
 "Play again?" prompt after game over
 Save and load progress
See the open issues for a full list of proposed features (and known issues).
<p align="right">(<a href="#readme-top">back to top</a>)</p> <!-- CONTRIBUTING -->

