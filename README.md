# l2custom_acis

It is a copy from https://gitlab.com/Tryskell/acis_public in version 382.

It has some custom modifications for custom and fun servers.

Current modifications:

 - Enable/Disable attack from mounts with equipped weapon
 - Enable/Disable grade penalty
 - Migrated from ant build scripting to gradle
 - Basic API to modify on Air some server values

Future modifications:

 *Game modifications*

 - build new skill tress for every class, and merge some classes.
 - add and modify some skills
 - Modify base quests and created new ones

 *Develop modifications*

 - Migration all code to kotlin.
 - Include some Injection Dependecy framework
 - Include unit testing for new features development

 *Server modifications*

 - enable an easy NPC creation proccess with python scripting

 *How to build your version*
 
 - Run the build gradle command
 - Run the task copyDependenciesToLibFolder