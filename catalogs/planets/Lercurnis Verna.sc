Planet	"Verna/Lercurnis I"
{
	ParentBody     "Verna-Luci bar"
	Class          "Carbonia"
	Mass            4.8173
	Radius          10200
	InertiaMoment   0.32748
	Obliquity       0
	EqAscendNode    0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
		Panspermia true
	}

	Surface
	{
		Preset         "lercurnis_verna.cfg"
		SurfStyle       0.23616
		Randomize      (0.478, 0.785, -0.530)
		colorDistMagn   0.068223
		colorDistFreq   1194.1
		detailScale     128
		drivenDarkening 0
		seaLevel        0.35115
		snowLevel       2
		tropicLatitude  0.63359
		icecapLatitude  0.8
		icecapHeight    0.21374
		climatePole     1
		climateTropic   0.59542
		climateEquator  0.55725
		climateSteppeMin -1
		climateSteppeMax 1
		climateForestMin 0.75
		climateForestMax 0.85
		climateGrassMin  0.85
		climateGrassMax  0.92
		humidity        0.29771
		heightTempGrad  0.4
		beachWidth      0.00094006
		tropicWidth     0.5
		mainFreq        1.6794
		venusFreq       1.4504
		venusMagn       1.4122
		mareFreq        3.5902
		mareDensity     0
		terraceProb     0.2014
		erosion         0.16794
		montesMagn      0.3
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.056542
		dunesFreq       66.396
		dunesFraction   0
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      7
		riversFreq      6
		riversSin       7
		riftsMagn       100
		riftsFreq       7
		riftsSin        7
		canyonsMagn     1
		canyonsFreq     50
		canyonsFraction 1
		cracksMagn      0
		cracksFreq      0.2
		cracksOctaves   15
		craterMagn      3
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		volcanoMagn     1
		volcanoFreq     2
		volcanoDensity  0
		volcanoOctaves  0
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   1
		volcanoTemp     3000
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.7653
		stripeTwist     0.39039
		cycloneMagn     2.1042
		cycloneFreq     1.0967
		cycloneDensity  0.2772
		cycloneOctaves  0
		BumpHeight      14.589
		BumpOffset      5.123
		DiffMapAlpha   "Water"
		SpecBrightWater 1
		SpecBrightIce   0.85
		RoughnessWater  0.51145
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      2.1458
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           5.123
		Hapke           0
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  1

		Composition
		{
			H2O       	100
		}
	}

	Clouds
	{
		Height          11.112
		Velocity        203.4
		BumpHeight      2.3969
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0
		ModulateColor  (0.090 0.180 0.104)
		ModulateBright  1
		Opacity         0.83969
		mainFreq        0.87023
		mainOctaves     0
		Coverage        0.74046
		stripeZones     1.7653
		stripeTwist     0.39039
	}

	Clouds
	{
		Height          11.112
		Velocity        136.23
		BumpHeight      3.3969
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0
		ModulateColor  (0.093 0.176 0.180)
		ModulateBright  1
		Opacity         0.35115
		mainFreq        0.87023
		mainOctaves     0
		Coverage        0.74046
		stripeZones     1.7653
		stripeTwist     0.39039
	}

	Clouds
	{
		Height          11.112
		Velocity        176.78
		BumpHeight      4.3969
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0
		ModulateColor  (0.090 0.180 0.098)
		ModulateBright  1
		Opacity         0.85496
		mainFreq        0.87023
		mainOctaves     0
		Coverage        0.74046
		stripeZones     1.7653
		stripeTwist     0.39039
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Verna"
		Height          90
		Density         52.812
		Pressure        50
		Greenhouse      300
		Bright          10
		Opacity         1
		SkyLight        3.3333
		Hue             0
		Saturation      1

		Composition
		{
			N2        	87
			CO2       	9
			O2        	2.99
			H2O       	1
			CH4       	0.01368
		}
	}

	Aurora
	{
		Height         1
		NorthLat       90
		NorthLon       0
		NorthRadius    9540.9
		NorthWidth     9011.6
		NorthRings     10
		NorthBright    0.3
		NorthFlashFreq 74.372
		NorthMoveSpeed 0.78617
		NorthParticles 1000
		SouthLat       -90
		SouthLon       180
		SouthRadius    8889.9
		SouthWidth     10289
		SouthRings     10
		SouthBright    0.3
		SouthFlashFreq 65.509
		SouthMoveSpeed 0.77184
		SouthParticles 1000
		TopColor    (0.000 0.812 1.000)
		BottomColor (0.000 0.367 1.000)
	}

	Rings
	{
		InnerRadius     1.6648e+06
		OuterRadius     3.9393e+06
		EdgeRadius      1e+09
		MeanRadius      2.4081e+06
		Thickness       2244.6
		RocksMaxSize    18.5
		RocksSpacing    10000
		DustDrawDist    20000
		ChartRadius     24100
		RotationPeriod  3.6678
		Brightness      7.2519
		FrontBright     0.99237
		BackBright      10
		Density         7.417e-05
		Opacity         1e-06
		SelfShadow      0
		PlanetShadow    0
		Hapke           1
		SpotBright      3.0534
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       10000
		densityScale    10
		densityOffset   0.83969
		densityPower    10
		colorContrast   0
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.109648663
		SemiMajorAxis   1.38196223e-05
		Eccentricity    0.106870229
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 0
		MeanAnomaly     -30
	}
}

