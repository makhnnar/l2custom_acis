# reimagined-world-of-aden

Thi project starts as a fork of the l2acis interlude emulator in the version 382 and don't pretend to be an image of the same. To know more about please visit: https://gitlab.com/Tryskell/acis_public.

It has a lot of modifications for custom and fun servers, trying to change the original game experience.

Some of those modifications are:

 - Enable/Disable attack from mounts with equipped weapon
 - Enable/Disable grade penalty
 - Migrated from ant build scripting to gradle
 - Basic API to modify on Air some server values
 - Damage over time effect that can be applied to movement or casting user actions
 - Modified skill tress for every class like:
   - Summoners
   - Archers
   - Healers
   - Drawfs
   - Dual warriors
   - Single words warriors
   - Orc warriors
 - A set of new and unique skills
 - Modify some base quests
 - Created new ones like:
   - Researchers of the forbidden knowledge
   - Researches of Cruma Tower
   - Researches of the Giants Cave
   - Researches of the Tower of Insolence

 *Develop modifications*

 - Gradle build system

 *Server modifications*

 - enable an easy NPC creation proccess with python scripting

 *How to build your version*
 
 - Run the build gradle command
 - Run the task copyDependenciesToLibFolder

*How to add an special ability to an item*

- For server side
  - create a skill on the skill xml files with the special ability
  - create a new item on the item xml files with the skill id of the special ability
  - add the item to the item list of the npc that will sell it

*How to add an armor set to the game*

- For server side
  - create a skill on the skill xml files with the armor set skill
  - create a new row on the armorSets xml file with the armor set skill id attached to the armor set
