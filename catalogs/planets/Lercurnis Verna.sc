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
	Color          (0.600 0.594 0.588)

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
		seaLevel        0.066001
		snowLevel       1.084
		tropicLatitude  0.70478
		icecapLatitude  2
		icecapHeight    0.56632
		climatePole     0.64885
		climateTropic   0.5625
		climateEquator  0.5625
		climateSteppeMin -1
		climateSteppeMax -0.20611
		climateForestMin -1
		climateForestMax 0.61832
		climateGrassMin  0.61832
		climateGrassMax  0.77099
		humidity        0.38931
		heightTempGrad  1
		beachWidth      0.00094006
		tropicWidth     0.5
		mainFreq        1.374
		venusFreq       1.4504
		venusMagn       1.5649
		mareFreq        3.5902
		mareDensity     0
		terraceProb     0.2014
		erosion         0.16794
		montesMagn      0.3
		montesFreq      229.01
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.052939
		dunesFreq       87.884
		dunesFraction   0.10539
		hillsMagn       1
		hillsFreq       2137.4
		hillsFraction   0.70605
		hills2Fraction  0.32913
		riversMagn      10
		riversFreq      7
		riversSin       7
		riftsMagn       12.214
		riftsFreq       4.0201
		riftsSin        6.7122
		canyonsMagn     0.032672
		canyonsFreq     238.25
		canyonsFraction 0.98132
		cracksMagn      0.085086
		cracksFreq      0.84783
		cracksOctaves   0
		craterMagn      0.8363
		craterFreq      24.704
		craterDensity   1
		craterOctaves   5
		volcanoMagn     0.71477
		volcanoFreq     0.87026
		volcanoDensity  0.13167
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.58546
		volcanoRadius   0.44022
		volcanoTemp     202.89
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
		BumpOffset      0.96289
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		RoughnessWater  0.35
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
		Depth           0.96289
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
		RingsWinter     0.9565
		ModulateColor  (0.093 0.176 0.180)
		ModulateBright  1
		Opacity         0.32061
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
		RingsWinter     0.9565
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
		DustDrawDist    1e+06
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
		MeanAnomaly     0
	}
}

