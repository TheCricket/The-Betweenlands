package thebetweenlands.items;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemReed;
import net.minecraft.item.ItemStack;
import thebetweenlands.blocks.BLBlockRegistry;
import thebetweenlands.creativetabs.ModCreativeTabs;
import thebetweenlands.entities.EntityBLItemFrame;
import thebetweenlands.items.bow.EnumArrowType;
import thebetweenlands.items.bow.ItemBLArrow;
import thebetweenlands.items.bow.ItemWeedwoodBow;
import thebetweenlands.items.loot.ItemExplorerHat;
import thebetweenlands.items.loot.ItemRingOfPower;
import thebetweenlands.items.loot.ItemVoodooDoll;
import thebetweenlands.recipes.BLMaterials;

public class BLItemRegistry {
	public static final List<Item> ITEMS = new ArrayList<Item>();

	// BASIC MATERIALS
	public static final Item testItem = new TestItem().setUnlocalizedName("thebetweenlands.testItem").setTextureName("thebetweenlands:testItem");
	public static final Item swampTalisman = new SwampTalisman();
	public static final Item itemsGeneric = new ItemGeneric();
	public static final Item itemsGenericCrushed = new ItemGenericCrushed().setUnlocalizedName("thebetweenlands.groundStuff"); // TODO fix needing unloc name here to stop null in registry
	public static final Item itemsGenericPlantDrop = new ItemGenericPlantDrop().setUnlocalizedName("thebetweenlands.plantDrop");
	public static final Item lifeCrystal = new ItemLifeCrystal().setUnlocalizedName("thebetweenlands.lifeCrystal").setTextureName("thebetweenlands:lifeCrystal");

	// WEAPONS TOOLS
	public static final Item weedwoodSword = new SwordBL(BLMaterials.toolWeedWood).setUnlocalizedName("thebetweenlands.weedwoodSword").setTextureName("thebetweenlands:weedWoodSword");
	public static final Item weedwoodPickaxe = new PickaxeBL(BLMaterials.toolWeedWood).setUnlocalizedName("thebetweenlands.weedwoodPickaxe").setTextureName("thebetweenlands:weedWoodPickaxe");
	public static final Item weedwoodAxe = new AxeBL(BLMaterials.toolWeedWood).setUnlocalizedName("thebetweenlands.weedwoodAxe").setTextureName("thebetweenlands:weedWoodAxe");
	public static final Item weedwoodShovel = new SpadeBL(BLMaterials.toolWeedWood).setUnlocalizedName("thebetweenlands.weedwoodShovel").setTextureName("thebetweenlands:weedWoodShovel");
	public static final Item weedwoodBow = new ItemWeedwoodBow().setUnlocalizedName("thebetweenlands.weedwoodBow").setTextureName("thebetweenlands:weedwoodBow");
	public static final Item anglerToothArrow = new ItemBLArrow("anglerToothArrow", EnumArrowType.DEFAULT).setUnlocalizedName("thebetweenlands.anglerToothArrow");
	public static final Item poisonedAnglerToothArrow = new ItemBLArrow("poisonedAnglerToothArrow", EnumArrowType.ANGLER_POISON).setUnlocalizedName("thebetweenlands.poisonedAnglerToothArrow");
	public static final Item octineArrow = new ItemBLArrow("octineArrow", EnumArrowType.OCTINE).setUnlocalizedName("thebetweenlands.octineArrow");
	public static final Item basiliskArrow = new ItemBLArrow("basiliskArrow", EnumArrowType.BASILISK).setUnlocalizedName("thebetweenlands.basiliskArrow");

	public static final Item betweenstoneSword = new SwordBL(BLMaterials.toolBetweenstone).setUnlocalizedName("thebetweenlands.betweenstoneSword").setTextureName("thebetweenlands:betweenstoneSword");
	public static final Item betweenstonePickaxe = new PickaxeBL(BLMaterials.toolBetweenstone).setUnlocalizedName("thebetweenlands.betweenstonePickaxe").setTextureName("thebetweenlands:betweenstonePickaxe");
	public static final Item betweenstoneAxe = new AxeBL(BLMaterials.toolBetweenstone).setUnlocalizedName("thebetweenlands.betweenstoneAxe").setTextureName("thebetweenlands:betweenstoneAxe");
	public static final Item betweenstoneShovel = new SpadeBL(BLMaterials.toolBetweenstone).setUnlocalizedName("thebetweenlands.betweenstoneShovel").setTextureName("thebetweenlands:betweenstoneShovel");

	public static final Item octineSword = new SwordBL(BLMaterials.toolOctine).setUnlocalizedName("thebetweenlands.octineSword").setTextureName("thebetweenlands:octineSword");
	public static final Item octinePickaxe = new PickaxeBL(BLMaterials.toolOctine).setUnlocalizedName("thebetweenlands.octinePickaxe").setTextureName("thebetweenlands:octinePickaxe");
	public static final Item octineAxe = new AxeBL(BLMaterials.toolOctine).setUnlocalizedName("thebetweenlands.octineAxe").setTextureName("thebetweenlands:octineAxe");
	public static final Item octineShovel = new SpadeBL(BLMaterials.toolOctine).setUnlocalizedName("thebetweenlands.octineShovel").setTextureName("thebetweenlands:octineShovel");

	public static final Item valoniteSword = new SwordBL(BLMaterials.toolValonite).setUnlocalizedName("thebetweenlands.valoniteSword").setTextureName("thebetweenlands:valoniteSword");
	public static final Item valonitePickaxe = new PickaxeBL(BLMaterials.toolValonite).setUnlocalizedName("thebetweenlands.valonitePickaxe").setTextureName("thebetweenlands:valonitePickaxe");
	public static final Item valoniteAxe = new AxeBL(BLMaterials.toolValonite).setUnlocalizedName("thebetweenlands.valoniteAxe").setTextureName("thebetweenlands:valoniteAxe");
	public static final Item valoniteShovel = new SpadeBL(BLMaterials.toolValonite).setUnlocalizedName("thebetweenlands.valoniteShovel").setTextureName("thebetweenlands:valoniteShovel");

	public static final Item weedwoodBucket = new ItemWeedwoodBucket();
	public static final Item weedwoodBucketTar = new ItemWeedwoodBucket(BLBlockRegistry.tarFluid).setUnlocalizedName("thebetweenlands.weedwoodBucketTar").setTextureName("thebetweenlands:weedwoodBucketTar");
	public static final Item weedwoodBucketWater = new ItemWeedwoodBucket(BLBlockRegistry.swampWater).setUnlocalizedName("thebetweenlands.weedwoodBucketWater").setTextureName("thebetweenlands:weedwoodBucketWater");
	public static final Item weedwoodStagnantWater = new ItemWeedwoodBucket(BLBlockRegistry.stagnantWaterFluid).setUnlocalizedName("thebetweenlands.weedwoodBucketStagnantWater").setTextureName("thebetweenlands:weedwoodBucketStagnantWater");

	public static final Item legendarySword = new SwordBL(BLMaterials.toolOfLegends).setUnlocalizedName("thebetweenlands.legendarySword").setTextureName("thebetweenlands:legendarySword");

	public static final Item sickle = new ItemSickle();

	public static final Item syrmoriteShears = new ItemSyrmoriteShears();

	// MISC ARMOUR
	public static final Item lurkerSkinHelmet = new LurkerSkinArmor(0).setUnlocalizedName("thebetweenlands.lurkerSkinHelmet").setTextureName("thebetweenlands:lurkerSkinHelmet");
	public static final Item lurkerSkinChestplate = new LurkerSkinArmor(1).setUnlocalizedName("thebetweenlands.lurkerSkinChestplate").setTextureName("thebetweenlands:lurkerSkinChestplate");
	public static final Item lurkerSkinLeggings = new LurkerSkinArmor(2).setUnlocalizedName("thebetweenlands.lurkerSkinLeggings").setTextureName("thebetweenlands:lurkerSkinLeggings");
	public static final Item lurkerSkinBoots = new LurkerSkinArmor(3).setUnlocalizedName("thebetweenlands.lurkerSkinBoots").setTextureName("thebetweenlands:lurkerSkinBoots");

	public static final Item boneHelmet = new BoneArmor(0).setUnlocalizedName("thebetweenlands.boneHelmet").setTextureName("thebetweenlands:boneHelmet");
	public static final Item boneChestplate = new BoneArmor(1).setUnlocalizedName("thebetweenlands.boneChestplate").setTextureName("thebetweenlands:boneChestplate");
	public static final Item boneLeggings = new BoneArmor(2).setUnlocalizedName("thebetweenlands.boneLeggings").setTextureName("thebetweenlands:boneLeggings");
	public static final Item boneBoots = new BoneArmor(3).setUnlocalizedName("thebetweenlands.boneBoots").setTextureName("thebetweenlands:boneBoots");

	public static final Item syrmoriteHelmet = new SyrmoriteArmor(0).setUnlocalizedName("thebetweenlands.syrmoriteHelmet").setTextureName("thebetweenlands:syrmoriteHelmet");
	public static final Item syrmoriteChestplate = new SyrmoriteArmor(1).setUnlocalizedName("thebetweenlands.syrmoriteChestplate").setTextureName("thebetweenlands:syrmoriteChestplate");
	public static final Item syrmoriteLeggings = new SyrmoriteArmor(2).setUnlocalizedName("thebetweenlands.syrmoriteLeggings").setTextureName("thebetweenlands:syrmoriteLeggings");
	public static final Item syrmoriteBoots = new SyrmoriteArmor(3).setUnlocalizedName("thebetweenlands.syrmoriteBoots").setTextureName("thebetweenlands:syrmoriteBoots");

	public static final Item legendaryHelmet = new ArmorOfLegends(0).setMaxDamage(-1).setUnlocalizedName("thebetweenlands.legendaryHelmet").setTextureName("thebetweenlands:legendaryHelmet");
	public static final Item legendaryChestplate = new ArmorOfLegends(1).setMaxDamage(-1).setUnlocalizedName("thebetweenlands.legendaryChestplate").setTextureName("thebetweenlands:legendaryChestplate");
	public static final Item legendaryLeggings = new ArmorOfLegends(2).setMaxDamage(-1).setUnlocalizedName("thebetweenlands.legendaryLeggings").setTextureName("thebetweenlands:legendaryLeggings");
	public static final Item legendaryBoots = new ArmorOfLegends(3).setMaxDamage(-1).setUnlocalizedName("thebetweenlands.legendaryBoots").setTextureName("thebetweenlands:legendaryBoots");

	public static final Item valoniteHelmet = new ValoniteArmor(0).setUnlocalizedName("thebetweenlands.valoniteHelmet").setTextureName("thebetweenlands:valoniteHelmet");
	public static final Item valoniteChestplate = new ValoniteArmor(1).setUnlocalizedName("thebetweenlands.valoniteChestplate").setTextureName("thebetweenlands:valoniteChestplate");
	public static final Item valoniteLeggings = new ValoniteArmor(2).setUnlocalizedName("thebetweenlands.valoniteLeggings").setTextureName("thebetweenlands:valoniteLeggings");
	public static final Item valoniteBoots = new ValoniteArmor(3).setUnlocalizedName("thebetweenlands.valoniteBoots").setTextureName("thebetweenlands:valoniteBoots");

	public static final Item rubberBoots = new ItemRubberBoots().setUnlocalizedName("thebetweenlands.rubberBoots").setTextureName("thebetweenlands:rubberBoots");
	public static final Item rubberBootsImproved = new ItemImprovedRubberBoots().setUnlocalizedName("thebetweenlands.rubberBootsImproved").setTextureName("thebetweenlands:rubberBoots");

	// CREATIVE
	public static final Item spawnEggs = new SpawnEggs().setUnlocalizedName("thebetweenlands.monsterPlacer").setTextureName("spawn_egg");

	//FOOD
	public static final Item sapBall = new ItemSapBall().setUnlocalizedName("thebetweenlands.sapBall").setTextureName("thebetweenlands:sapBall");
	public static final Item rottenFood = new ItemRottenFood().setAlwaysEdible().setUnlocalizedName("thebetweenlands.rottenFood").setTextureName("thebetweenlands:rottenFood");
	public static final Item middleFruitSeeds = new ItemBLGenericSeed(0, 0F, BLBlockRegistry.middleFruitBush, BLBlockRegistry.farmedDirt).setUnlocalizedName("thebetweenlands.middleFruitSeeds").setTextureName("thebetweenlands:middleFruitSeeds");

	public static final Item anglerMeatRaw = new ItemFood(4, 1.8F, false).setUnlocalizedName("thebetweenlands.anglerMeatRaw").setTextureName("thebetweenlands:anglerFlesh");
	public static final Item anglerMeatCooked = new ItemFood(8, 18.0F, false).setUnlocalizedName("thebetweenlands.anglerMeatCooked").setTextureName("thebetweenlands:cookedAnglerFlesh");
	public static final Item frogLegsRaw = new ItemFood(2, 1.2F, false).setUnlocalizedName("thebetweenlands.frogLegsRaw").setTextureName("thebetweenlands:frogLegs");
	public static final Item frogLegsCooked = new ItemFood(2, 1.2F, false).setUnlocalizedName("thebetweenlands.frogLegsCooked").setTextureName("thebetweenlands:frogLegsCooked");
	public static final Item snailFleshRaw = new ItemFood(3, 1.6F, false).setUnlocalizedName("thebetweenlands.snailFleshRaw").setTextureName("thebetweenlands:snailMeat");
	public static final Item snailFleshCooked = new ItemFood(6, 13.2F, false).setUnlocalizedName("thebetweenlands.snailFleshCooked").setTextureName("thebetweenlands:cookedSnailMeat");
	public static final Item reedDonut = new ItemFood(6, 13.2F, false).setUnlocalizedName("thebetweenlands.reedDonut").setTextureName("thebetweenlands:donut");
	public static final Item jamDonut = new ItemFood(10, 20.0F, false).setUnlocalizedName("thebetweenlands.jamDonut").setTextureName("thebetweenlands:jamDonut");
	public static final Item gertsDonut = new ItemGertsDonut().setUnlocalizedName("thebetweenlands.gertsDonut").setTextureName("thebetweenlands:gertsDonut");
	public static final Item krakenTentacle = new ItemFood(8, 8.0F, false).setUnlocalizedName("thebetweenlands.krakenTentacle").setTextureName("thebetweenlands:krakenTentacle");
	public static final Item krakenCalamari = new ItemFood(14, 20.0F, false).setUnlocalizedName("thebetweenlands.krakenCalamari").setTextureName("thebetweenlands:krakenCalamari");
	public static final Item middleFruit = new ItemFood(6, 15.6F, false).setUnlocalizedName("thebetweenlands.middleFruit").setTextureName("thebetweenlands:middleFruit");
	public static final Item mincePie = new ItemFood(4, 14.8F, false).setUnlocalizedName("thebetweenlands.mincePie").setTextureName("thebetweenlands:mincePie");
	public static final Item weepingBluePetal = new ItemWeepingBluePetal().setUnlocalizedName("thebetweenlands.weepingBluePetal").setTextureName("thebetweenlands:weepingBluePetal");
	public static final Item wightsHeart = new ItemWightHeart().setUnlocalizedName("thebetweenlands.wightHeart").setTextureName("thebetweenlands:wightHeart");
	public static final Item yellowDottedFungus = new ItemFood(10, 20.0F, false).setUnlocalizedName("thebetweenlands.yellowDottedFungus").setTextureName("thebetweenlands:yellowDottedFungus");
	public static final Item siltCrabClaw = new ItemFood(2, 0.6F, false).setUnlocalizedName("thebetweenlands.siltCrabClaw").setTextureName("thebetweenlands:siltCrabClaw");
	public static final Item crabstick = new ItemFood(6, 5.3F, false).setUnlocalizedName("thebetweenlands.crabstick").setTextureName("thebetweenlands:crabStick");
	public static final Item nettleSoup = new ItemNettleSoup().setUnlocalizedName("thebetweenlands.nettleSoup").setTextureName("thebetweenlands:nettleSoup");
	public static final Item sludgeJello = new ItemFood(4, 15F, false).setUnlocalizedName("thebetweenlands.sludgeJello").setTextureName("thebetweenlands:sludgeJello");
	public static final Item middleFruitJello = new ItemFood(10, 20F, false).setUnlocalizedName("thebetweenlands.middleFruitJello").setTextureName("thebetweenlands:middleFruitJello");
	public static final Item sapJello = new ItemSapJello().setUnlocalizedName("thebetweenlands.sapJello").setTextureName("thebetweenlands:sapJello");
	public static final Item marshmallow = new ItemMarshmallow().setUnlocalizedName("thebetweenlands.marshmallow").setTextureName("thebetweenlands:greenMarshmallow");
	public static final Item marshmallowPink = new ItemMarshmallowPink().setUnlocalizedName("thebetweenlands.marshmallowPink").setTextureName("thebetweenlands:pinkMarshmallow");
	public static final Item flatheadMushroomItem = new ItemFlatheadMushroom().setUnlocalizedName("thebetweenlands.flatheadMushroomItem").setTextureName("thebetweenlands:flatheadMushroom");
	public static final Item blackHatMushroomItem = new ItemBlackHatMushroom().setUnlocalizedName("thebetweenlands.blackHatMushroomItem").setTextureName("thebetweenlands:blackHatMushroom");
	public static final Item bulbCappedMushroomItem = new ItemBulbCappedMushroom().setUnlocalizedName("thebetweenlands.bulbCappedMushroomItem").setTextureName("thebetweenlands:bulbCappedMushroom");
	public static final Item friedSwampKelp = new ItemFood(5, 8.0F, false).setUnlocalizedName("thebetweenlands.friedSwampKelp").setTextureName("thebetweenlands:friedSwampKelp");
	public static final Item forbiddenFig = new ItemForbiddenFig().setUnlocalizedName("thebetweenlands.forbiddenFig").setTextureName("thebetweenlands:forbiddenFig");
	public static final Item candyBlue = new ItemFood(3, 10F, false).setUnlocalizedName("thebetweenlands.candyBlue").setTextureName("thebetweenlands:sweetBlue");
	public static final Item candyRed = new ItemFood(3, 10F, false).setUnlocalizedName("thebetweenlands.candyRed").setTextureName("thebetweenlands:sweetRed");
	public static final Item candyYellow = new ItemFood(3, 10F, false).setUnlocalizedName("thebetweenlands.candyYellow").setTextureName("thebetweenlands:sweetYellow");

	//DOORS
	public static final Item doorWeedwood = new ItemBLDoor(BLBlockRegistry.doorWeedwood);
	public static final Item doorOctine = new ItemBLDoor(BLBlockRegistry.doorSyrmorite);

	//MISC
	public static final ItemShimmerStone shimmerStone = new ItemShimmerStone();
	public static final Item angryPebble = new ItemAngryPebble();
	public static final Item scroll = new Item().setUnlocalizedName("thebetweenlands.itemScroll").setTextureName("thebetweenlands:itemScroll").setMaxStackSize(1);
	public static final Item weedwoodBucketRubber = new ItemWeedwoodBucketRubber();
	public static final Item itemFrame = new ItemBLHangingEntity(EntityBLItemFrame.class).setUnlocalizedName("thebetweenlands.weedwoodItemFrame").setTextureName("thebetweenlands:weedwoodItemFrame").setCreativeTab(ModCreativeTabs.blocks);
	public static final Item mudFlowerPot = new ItemReed(BLBlockRegistry.mudFlowerPot).setUnlocalizedName("thebetweenlands.mudFlowerPotItem").setCreativeTab(ModCreativeTabs.blocks).setTextureName("thebetweenlands:mudBrickFlowerPot");
	public static final Item pestle = new ItemPestle().setUnlocalizedName("thebetweenlands.pestle");
	public static final Item weedwoodBucketInfusion = new ItemWeedwoodBucketInfusion();
	public static final Item manual = new ItemManual().setUnlocalizedName("thebetweenlands.manual").setTextureName("manual");
	public static final Item tarminion = new ItemTarminion().setUnlocalizedName("thebetweenlands.tarminion");
	public static final Item volarPad = new ItemVolarPad().setMaxDamage(200);
	public static final Item weedwoodRowboat = new ItemWeedwoodRowboat();
	public static final ItemRope rope = new ItemRope();

	//LOOT
	public static final Item voodooDoll = new ItemVoodooDoll();
	public static final Item explorerHat = new ItemExplorerHat().setUnlocalizedName("thebetweenlands.explorerHat").setTextureName("thebetweenlands:explorersHat");
	public static final Item ringOfPower = new ItemRingOfPower();
	public static final Item swiftPick = new ItemSwiftPick(BLMaterials.toolLoot).setMaxDamage(64).setUnlocalizedName("thebetweenlands.swiftPickaxe").setTextureName("thebetweenlands:swiftPick");
	public static final Item wightsBane = new SwordBL(BLMaterials.toolWeedWood).setMaxDamage(32).setUnlocalizedName("thebetweenlands.wightsBane").setTextureName("thebetweenlands:wightsBane");
	public static final Item skullMask = new ItemSkullMask().setUnlocalizedName("thebetweenlands.skullMask").setTextureName("thebetweenlands:skullMask");
	public static final Item tribalPants = new ItemArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 2).setUnlocalizedName("thebetweenlands.tribalPants").setTextureName("thebetweenlands:tribalPants");

	//DISCS
	public static final Item astatos = new ItemBLRecord("Astatos");
	public static final Item betweenYouAndMe = new ItemBLRecord("BetweenYouAndMe");
	public static final Item christmasOnTheMarsh = new ItemBLRecord("ChristmasOnTheMarsh");
	public static final Item theExplorer = new ItemBLRecord("TheExplorer");
	public static final Item hagDance = new ItemBLRecord("HagDance");
	public static final Item lonelyFire = new ItemBLRecord("LonelyFire");
	public static final Item mysteriousRecord = new ItemBLRecord("16612");

	public static final Item ancient = new ItemBLRecord("Ancient");
	public static final Item beneathAGreenSky = new ItemBLRecord("BeneathAGreenSky");
	public static final Item dJWightsMixtape = new ItemBLRecord("DJWightsMixtape");
	public static final Item onwards = new ItemBLRecord("Onwards");
	public static final Item stuckInTheMud = new ItemBLRecord("StuckInTheMud");
	public static final Item wanderingWisps = new ItemBLRecord("WanderingWisps");
	public static final Item waterlogged = new ItemBLRecord("Waterlogged");

	public static final ItemElixir elixir = new ItemElixir();
	public static final ItemDentrothystVial dentrothystVial = new ItemDentrothystVial();

	public static void init() {
		initCreativeTabs();
		registerItems();
		registerProperties();
	}

	private static void initCreativeTabs() {
		ModCreativeTabs.items.setTab(rope, weedwoodRowboat, volarPad, swampTalisman, itemsGeneric, sapBall, rottenFood, flatheadMushroomItem, blackHatMushroomItem, bulbCappedMushroomItem, anglerMeatRaw, anglerMeatCooked, frogLegsRaw, frogLegsCooked, snailFleshRaw,
				snailFleshCooked, friedSwampKelp, reedDonut, jamDonut, krakenTentacle, krakenCalamari, middleFruit, mincePie, weepingBluePetal,
				wightsHeart, yellowDottedFungus, siltCrabClaw, crabstick, nettleSoup, sludgeJello, middleFruitJello, sapJello, marshmallow, marshmallowPink, weedwoodBucket, weedwoodStagnantWater, weedwoodBucketWater, weedwoodBucketTar, lifeCrystal, gertsDonut, forbiddenFig, candyBlue, candyRed, candyYellow);
		ModCreativeTabs.specials.setTab(shimmerStone, tribalPants, skullMask, testItem, spawnEggs, angryPebble, scroll, voodooDoll, ringOfPower, swiftPick, wightsBane, manual, tarminion, astatos, betweenYouAndMe, theExplorer, christmasOnTheMarsh, ancient, beneathAGreenSky, dJWightsMixtape, onwards, stuckInTheMud, wanderingWisps, waterlogged, hagDance, lonelyFire, mysteriousRecord);
		ModCreativeTabs.gears.setTab(weedwoodSword, weedwoodPickaxe, weedwoodAxe, weedwoodShovel, betweenstoneSword, betweenstonePickaxe, betweenstoneAxe, betweenstoneShovel, octineSword, octinePickaxe, octineAxe, octineShovel, valoniteSword, valonitePickaxe, valoniteAxe, valoniteShovel);
		ModCreativeTabs.gears.setTab(legendarySword, legendaryBoots, legendaryChestplate, legendaryHelmet, legendaryLeggings, lurkerSkinHelmet, lurkerSkinChestplate, lurkerSkinLeggings, lurkerSkinBoots, boneHelmet, boneChestplate, boneLeggings, boneBoots, syrmoriteHelmet, syrmoriteChestplate, syrmoriteLeggings, syrmoriteBoots, valoniteHelmet, valoniteChestplate, valoniteLeggings, valoniteBoots, weedwoodBow, anglerToothArrow, poisonedAnglerToothArrow, octineArrow, basiliskArrow, explorerHat, rubberBoots, rubberBootsImproved);
		ModCreativeTabs.plants.setTab(middleFruitSeeds);
		ModCreativeTabs.herbLore.setTab(pestle, itemsGenericCrushed, itemsGenericPlantDrop, weedwoodBucketInfusion, elixir, dentrothystVial);
	}

	private static void registerItems() {
		try {
			for (Field f : BLItemRegistry.class.getDeclaredFields()) {
				Object obj = f.get(null);
				if (obj instanceof Item) registerItem((Item) obj);
				else if (obj instanceof Item[])
					for (Item item : (Item[]) obj)
						registerItem(item);
			}
		}
		catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

	private static void registerItem(Item item) {
		ITEMS.add(item);
		String name = item.getUnlocalizedName();
		String[] strings = name.split("\\.");
		GameRegistry.registerItem(item, strings[strings.length - 1]);
	}

	private static void registerProperties() {
		GameRegistry.registerFuelHandler(new IFuelHandler() {
			@Override
			public int getBurnTime(ItemStack fuel) {
				return 0;
				//add fuels here
			}
		});
	}
}
