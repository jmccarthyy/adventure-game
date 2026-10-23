<h1>Simple Text-Based Adventure Game</h1>

A simple, choose-your-own-adventure game for the terminal, written in Java. Roll your stats, make choices, pick up gear, and try not to get killed. Based on classic books like Fighting Fantasy. 

Built from scratch to be simple, done feature-by-feature to refresh my Java skills.

<h2>About The Project:</h2>

You create a character, roll for your stats, and then make choices that decide how the story unfolds. Some choices help you. Others end the game.

<h2>Features so far:</h2>
<ul>
<li>Character creation with a name confirmation step</li>
<li>Roll Skill, Health and Luck with physical dice (you type the results) or virtual dice</li>
<li>Branching story with a game over if you choose badly</li>
<li>Inventory using an Item base class, with Weapon and Potion subclasses</li>
<li>A status screen showing stats, gold, provisions, inventory and weapon</li>
</ul>

<h2>Features Roadmap:</h2>

<h4>Completed:</h4>
[X] Character creation<br>
[X] Status screen<br>
[X] Item system<br>
[X] Game over on death<br>

<h4>Coming soon:</h4>
[ ] Use potions<br>
[ ] Combat System<br>
[ ] More story scenes<br>
[ ] Equip and swap weapons<br>
[ ] Allow user to check their status at will<br>
[ ] Allow user to consume provisions at will<br>
[ ] Validation<br>

<h2>Project Structure</h2>
<ul>
  <li><code>Game.java</code> - Entry point, runs character creation then the story</li>
  <li><code>CharacterCreation.java</code> - Name entry and stat rolling</li>
  <li><code>Character.java</code> - The player: stats, gold, inventory, equipped weapon</li>
  <li><code>Item.java</code> - Base class for carried items</li>
  <li><code>Weapon.java</code> - An item with an <code>addedSkill</code> bonus</li>
  <li><code>Potion.java</code> - An item with a <code>statChangeValue</code></li>
  <li><code>Story.java</code> - The story scenes and choices</li>
  <li><code>Misc.java</code> - Small helper output</li>
</ul>
