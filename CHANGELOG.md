# ***All the Missing Simple Recipes ChangeLog:***

--------------------------
 v0.3.0.1b52 | 2023/08/05
--------------------------
* ***added:***
  * Slabs 'n Stairs Support:
    * Planks, Slabs & Pressure Plates added to the appropriate Tags
  * Recipe Soul Soil from Soul Sand (credit DiamondKingHD)
  * new RECIPE List as md-File *[RECIPES.md](recipes.md)*
* ***updated:***
  * a lot of Tags
  * Recipe & Advancement because the used Tag 'Planks' was changed
  * changes & updates in some project building files to prepare changes
    for an easier versioning & publishing
* ***removed:***
  * Melon Slice from Melon - because the Recipe 'consume' the used Tool
  * min/max item count from the advancements  
  * some unused code & files

This Version of the Mod is successfully testet with
    *[**Forge ~~32.0.107~~ | ~~33.0.61~~ | ~~34.1.41~~ | ~~35.1.37~~ | 36.2.39**](https://files.minecraftforge.net/net/minecraftforge/forge/index_1.16.5.html)*

The detailed ChangeLog is available on *[**GitHub**](https://github.com/DancerVlt69/AllTheMissingRecipes/blob/1.16.x/CHANGELOG.md)*

____________________
 The new Versioning
--------------------
* Available / added for the Minecraft JE Versions
    - ~~***1.8.9***~~ | ~~***1.12.2***~~ | ***1.15.x*** | ***1.16.x*** | ~~***1.18x***~~ | ~~***1.19.1/2***~~ | ~~***1.19.3***~~ | ~~***1.19.4/1.20***~~ |
* Short description of the new Versioning:
	- 1st digit = **Major-Version** of the Mod - e.g. ***v0.*** or ***v1.***
	- 2nd digit = will be a placeholder for
	  - **v0.** ***01.*** *xxx*.*xxx*.b*xxx* ≙  MC Version 1.8.x (planned)
	  - **v0.** ***02.*** *xxx*.*xxx*.b*xxx* ≙  MC Version 1.12.x (work in progress)
	  - **v0.** ***03.*** *xxx*.*xxx*.b*xxx* ≙  MC Version 1.15.x
	  - **v0.** ***04.*** *xxx*.*xxx*.b*xxx* ≙  MC Version 1.16.x
	  - **v0.** ***05.*** *xxx*.*xxx*.b*xxx* ≙  MC Version 1.18x
	  - **v0.** ***06.*** *xxx*.*xxx*.b*xxx* ≙  MC Version 1.19.1/2
      - **v0.** ***07.*** *xxx*.*xxx*.b*xxx* ≙  MC Version 1.19.3
      - **v0.** ***08.*** *xxx*.*xxx*.b*xxx* ≙  MC Version 1.19.4? (or 1.20x)
	- 3rd digit ≙ **Minor-Version** of the Mod
	- 4th digit ≙ **a BugFix-Version** 
    - 5th digit ≙ **Build Number** of the mod of their respective MC-Version

----------------------
 v0.2.1b | 2022/07/18
----------------------
* fixed:
    - issue#4 parsing error loading custom advancement, unknown required criterion
    - issue#6 parsing error loading recipe, missing item

* added/updated:
  - "Slabs to Block" - Recipes and their Advancements for
    * Polished -Andesite / -Diorite / -Granite,
    * Polished- / Blackstone / -Bricks
    * Cut- / Smooth- Red- / -Sandstone
    * Bricks, Mossy- / Stone Bricks / -Cobblestone
    * Smooth- / Quartz
    * Purpur Block, EndStone Bricks,
    * Dark- / Prismarine / -Bricks
    * Red Nether-Bricks
  - some other missing Advancements,
  - grouped some Recipes
  - updated Forge to Version *36.2.39*

-----------------------------------
 v0.2.0a (right now in Alpha-Test)
-----------------------------------
* adding a lot of missing advancements
* adding recipes:
    - Stone- * Axe, * Hoe, * Shovel and/or  * Sword from (Clean-) Stone
    - Wooden Planks from Wooden Slabs for the mods (if available for your MC-Version)
       * BambooEverything
       * Environmental (Cherry, Willow, Wisteria)
    - Blocks from Slabs for
        * Andesite, Diorite, Granit, Nether-Bricks

* adding & automate buildVersionNumber
* grouped some recipes
* updating recipes list (txt)
* adding issue tracker url
* updating license version from GNU 2.0 to 3.0   

----------
 v0.1.7d
----------
* start porting to MC Version 1.19

----------
 v0.1.7c
----------
* start porting to Minecraft Version 1.17.1 (and 1.18)
* some small corrections

----------
 v.1.7b 
----------
* set license to GNU 2.0, now the code is free to use for all
* fixes
	- adding some missed recipes to the recipe group "Slabs 2 Planks"
	- fixed one hidden recipe

* added recipes
    - Oak Plank from Chest and Shield
	- Pickaxe from Stone Blocks and Sticks
	- Sticks from Arrow or Bow
	- Stone Blocks from Stone Slabs | 2 Blocks from 4 Slabs
		* Cobblestone
		* Stone

* changes
	- some directory oder corrections
	- some corrections on the recipe-list

------------------------------------------
 v0.1.6b - running on Minecraft 1.16.1-5 
------------------------------------------
Inside the mod:

* added recipe/s
	- Bleached (white) Wool Blocks, Carpets, or Banners from the colored one
	- Leather from Rotten Flesh on the Campfire
	- Planks from Wooden Slaps (36 recipes) | 2 Planks from 4 Slabs
	    supported Wood types
		    * Minecraft standard
			
			* Atmospheric
			* Autumnity
			* Bamboo Blocks (V 2.1.0)
			* Biomes O' Plenty
			* Environmental
			* The Endergetic
			* Upgrade Aquatic

----------
 v0.1.5b
----------
Inside the mod:

* added recipe/s
	- Bone Meal from Nautilus Shell
	- Leather from Armor, Horse Armor, and Saddle - 6 recipes
	- Magma Cream from Magma Block (9 sec.), plus 0.3 XP (0.1 per Magma Cream)
	- Stick from Arrow or Bow - 2 recipes

----------
 v0.1.4c
----------
* reorganized the recipe list in the description from alphabetical order to 'craft with' categories
* (re-) uploaded all screenshots in Vanilla-optic

Inside the mod:

* removed some planned, but not working recipes, and some unused files
* first steps for/to a better Forge-compatibility

* added recipe/s
	- Iron Nuggets from Iron Door (6 sec.), plus 0.4 XP (0.2 per invested Iron Ingot)

* changed recipes
	- Bricks Block  from Clay Block
		* decreased blasting time to 10 seconds
		* increased the XP up to 0,35

	- Iron Nuggets from Bucket:
		- set blasting time to 9 seconds
		- increased the XP up to 0,6 (0,2 per invested Iron Ingot)

---------------
 v0 to 0.1.3c
---------------
adding the recipes step by step from the Save-Game folder into the mod, reorganizing the folder structure many times ;)

* Brick Block from Clay Block (12 sec.), plus 0.125 XP per block
* Diamond from Coal-Blocks
* Gunpowder from NetherQuartz, CharCoal and Glowstone Powder
* Gunpowder from a TNT-Block
* Iron Nuggets from (empty) Bucket, plus 0.2 XP per Bucket
* Leather from Rotten Flesh
* Nametags from Strings and Pressure Plates, Wooden Slabs or Wooden Planks
* Paper from Bamboo (Sticks)
* Strings from a white Wool Block
