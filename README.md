# MinehutAPI Skripts
## This is outdated without the use of minehut cosmetics of the zip folder. Minehut API only gets player ranks in minehut.
This requires MinehutCosmetics!!!!!!!!!

## MinehutAPI (ACMHAPI.sk)
###Types
```
%rank% = %string%
```
###Expressions
Player expressions
```
# Player expressions
[the] %player%'s minehut rank
[the] minehut rank of %player%
```
Rank expressions
```
# Prefix
[the] minehut rank %rank%'s prefix%
[the] prefix of [the] minehut rank %rank%
# Prefix color
[the] minehut rank %rank%'s prefix colo[u]r
[the] prefix colo[u]r of [the] minehut rank %rank%
# Permissions (This is most likely "" or not set)
[the] minehut rank %rank%'s permission[s]
[the] permission[s] of [the] minehut rank %rank%
# Extra permissions (This is most likely set)
[the] minehut rank %rank%'s extra permission[s]
[the] extra permission[s] of [the] minehut rank %rank%
# Auras (I don't know what this does)
[the] minehut rank %rank%'s extra aura[s]
[the] extra aura[s] of [the] minehut group %rank%
# Chat delay (cooldown)
[the] minehut rank %rank%'s chat delay
[the] minehut rank %rank%'s chat cooldown
[the] chat delay of [the] minehut rank %rank%
[the] chat cooldown of [the] minehut rank %rank%
# Ordinal
[the] minehut rank %rank%'s ordinal
[the] ordinal of [the] minehut rank %rank%
# Ranks
[the] minehut ranks
[the] ranks of minehut
```
Effects:
```
send [the] minehut rank %string%' data to %players%
send [the] data of [minehut] rank %string% to %players%
```
## ACMHPlaceholders.sk
```
Types:
%id% = the name of the rank
```
Player rank
```
%minehutapi_player_rank% = rank of the placeholder player
```
Minehut rank
```
%minehutapi_rank_id;%id%% = the id of the rank (same as %id%
%minehutapi_rank_prefix;%id%% = prefix of the rank
%minehutapi_rank_prefix_color;%id%% = color of the rank
%minehutapi_rank_permissions;%id%% = permissions of the rank
%minehutapi_rank_extra_permissions;%id%% = extra permissions of the rank
%minehutapi_rank_extra_auras;%id%% = auras of the rank
%minehutapi_rank_chat_delay;%id%% = the chat cooldown of the rank
%minehutapi_rank_chat_cooldown;%id%% = the chat cooldown of the rank
%minehutapi_rank_ordinal% = the rank java id (in arraylist) (ADMIN = 0)
# ALL THE RANKS
%minehutapi_ranks%
```
## ACMHCosmeticsDisabler.sk
This disables all the commands in minehut cosmetics and the plugin
This disables following commands:
```
# Plugin commands
/minehutcosmetics:skin
/minehutcosmetics:unskin
/minehutcosmetics:cosmetics
/minehutcosmetics:cosmeticsdebug

/skin
/unskin
/cosmetics
/cosmeticsdebug
```
