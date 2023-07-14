Moon	"Achoo/Lercurnis B VIII II"
{
	ParentBody     "Cles"
	Class          "Terra"
	Mass            0.33891

	AlbedoBond      0.15
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Life
	{
		Class   "Exotic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}

	Surface
	{
		Preset         "lercurnis_kond_cles_achoo.cfg"
		SurfStyle       0.22481
		Randomize      (-0.884, 0.525, -0.235)
		colorDistMagn   0.048446
		colorDistFreq   419.19
		detailScale     128
		drivenDarkening 0
		seaLevel        0.39695
		snowLevel       2
		tropicLatitude  0.24427
		icecapLatitude  0.64122
		icecapHeight    0
		climatePole     0.90076
		climateTropic   0.67176
		climateEquator  1
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin 0.84
		climateForestMax 1
		climateGrassMin  0.76
		climateGrassMax  0.86
		humidity        0.45802
		heightTempGrad  1
		beachWidth      0.0010416
		tropicWidth     0.5
		mainFreq        0.57252
		venusFreq       1.1756
		venusMagn       0.1145
		mareFreq        5
		mareDensity     0.1145
		terraceProb     0.65099
		erosion         0.1145
		montesMagn      0.5
		montesFreq      100
		montesSpiky     0.5
		montesFraction  1
		dunesMagn       0.059469
		dunesFreq       20.443
		dunesFraction   0.85703
		hillsMagn       10
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      25
		riversFreq      10
		riversSin       7
		riftsMagn       100
		riftsFreq       10
		riftsSin        10
		canyonsMagn     0.0090077
		canyonsFreq     80.322
		canyonsFraction 0
		cracksMagn      0.1008
		cracksFreq      0.17655
		cracksOctaves   0
		craterMagn      1
		craterFreq      5
		craterDensity   1
		craterOctaves   30
		volcanoMagn     0.41985
		volcanoFreq     0.82443
		volcanoDensity  0.44275
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   0.58779
		volcanoTemp     2106.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     3.2513
		cycloneFreq     0.56778
		cycloneDensity  0.21521
		cycloneOctaves  2
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      2.0187
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          11.922
		Velocity        203.4
		BumpHeight      0.62215
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.39695
		mainFreq        1.4198
		mainOctaves     0
		Coverage        0.64122
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          11.922
		Velocity        203.4
		BumpHeight      0.85369
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.33588
		mainFreq        1.4198
		mainOctaves     0
		Coverage        0.64122
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          11.922
		Velocity        203.4
		BumpHeight      0.45341
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.35115
		mainFreq        1.4198
		mainOctaves     0
		Coverage        0.64122
		stripeZones     1
		stripeTwist     3.5
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Cles Achoo"
		Height          80
		Density         3615.3
		Pressure        1500
		Greenhouse      700
		Bright          7
		Opacity         1
		SkyLight        3.3333
		Hue             0
		Saturation      1
	}

	Aurora
	{
		Height         30.912
		NorthLat       58.296
		NorthLon       63.152
		NorthRadius    667.01
		NorthWidth     273.89
		NorthRings     4
		NorthBright    0.3
		NorthFlashFreq 61.028
		NorthMoveSpeed 1.1181
		NorthParticles 50000
		SouthLat       -29.427
		SouthLon       -104.84
		SouthRadius    943.97
		SouthWidth     299.35
		SouthRings     3
		SouthBright    0.3
		SouthFlashFreq 73.92
		SouthMoveSpeed 0.80588
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      2.01883131
		SemiMajorAxisKm 710503.914
		Eccentricity    0.01
		Inclination     0.1
		AscendingNode   68.7022901
		ArgOfPericenter -272.061069
		MeanAnomaly     0
	}
}

