Planet	"Verna/Lercurnis I"
{
	ParentBody     "Verna-Luci bar"
	Class          "Carbonia"
	Mass            4.82
	Radius          1.02e+04
	InertiaMoment   0.327
	Obliquity       0
	EqAscendNode    0
	TidalLocked     true

	EndogenousHeating 0
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
		SurfStyle       0.236
		Randomize      (0.478, 0.785, -0.530)
		colorDistMagn   0.0682
		colorDistFreq   1.19e+03
		detailScale     128
		drivenDarkening 0
		seaLevel        0.0534
		snowLevel       2
		tropicLatitude  0.634
		icecapLatitude  0.8
		icecapHeight    0.214
		climatePole     1
		climateTropic   0.595
		climateEquator  0.557
		climateSteppeMin -1
		climateSteppeMax 1
		climateForestMin 0.75
		climateForestMax 0.85
		climateGrassMin  0.85
		climateGrassMax  0.92
		humidity        0.298
		heightTempGrad  0.4
		beachWidth      0.00094
		tropicWidth     0.5
		mainFreq        1.68
		venusFreq       1.45
		venusMagn       0.802
		mareFreq        3.59
		mareDensity     0
		terraceProb     0.201
		erosion         0.168
		montesMagn      0.3
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.0565
		dunesFreq       66.4
		dunesFraction   0
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      1
		riversFreq      2
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
		volcanoTemp     3e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.77
		stripeTwist     0.39
		cycloneMagn     2.1
		cycloneFreq     1.1
		cycloneDensity  0.277
		cycloneOctaves  0
		BumpHeight      14.6
		BumpOffset      5.12
		DiffMapAlpha   "Water"
		SpecBrightWater 1
		SpecBrightIce   0.85
		RoughnessWater  0.511
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      2.15
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           0.78
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
		Height          11.1
		Velocity        203
		BumpHeight      2.4
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0
		ModulateColor  (0.090 0.180 0.104)
		ModulateBright  1
		Opacity         0.84
		mainFreq        0.87
		mainOctaves     0
		Coverage        0.74
		stripeZones     1.77
		stripeTwist     0.39
	}

	Clouds
	{
		Height          11.1
		Velocity        136
		BumpHeight      3.4
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0
		ModulateColor  (0.093 0.176 0.180)
		ModulateBright  1
		Opacity         0.351
		mainFreq        0.87
		mainOctaves     0
		Coverage        0.74
		stripeZones     1.77
		stripeTwist     0.39
	}

	Clouds
	{
		Height          11.1
		Velocity        177
		BumpHeight      4.4
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0
		ModulateColor  (0.090 0.180 0.098)
		ModulateBright  1
		Opacity         0.855
		mainFreq        0.87
		mainOctaves     0
		Coverage        0.74
		stripeZones     1.77
		stripeTwist     0.39
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Verna"
		Height          90
		Density         52.8
		Pressure        50
		Greenhouse      315
		Bright          10
		Opacity         1
		SkyLight        3.33
		Hue             0
		Saturation      1

		Composition
		{
			N2        	87
			CO2       	9
			O2        	2.99
			H2O       	1
			CH4       	0.0137
		}
	}

	Climate
	{
		GlobalWindSpeed  2.67
	}

	Aurora
	{
		Height         1
		NorthLat       90
		NorthLon       0
		NorthRadius    9.54e+03
		NorthWidth     9.01e+03
		NorthRings     10
		NorthBright    0.3
		NorthFlashFreq 74.4
		NorthMoveSpeed 0.786
		NorthParticles 1000
		SouthLat       -90
		SouthLon       180
		SouthRadius    8.89e+03
		SouthWidth     -nan(ind)
		SouthRings     10
		SouthBright    0.3
		SouthFlashFreq 65.5
		SouthMoveSpeed 0.772
		SouthParticles 1000
		TopColor    (0.000 0.812 1.000)
		BottomColor (0.000 0.367 1.000)
	}

	Rings
	{
		InnerRadius     1.66e+06
		OuterRadius     3.94e+06
		EdgeRadius      1e+09
		MeanRadius      2.41e+06
		Thickness       2.24e+03
		RocksMaxSize    0.0884
		RocksSpacing    1e+04
		DustDrawDist    1e+06
		ChartRadius     2.41e+04
		RotationPeriod  3.67
		Brightness      7.25
		FrontBright     0.992
		BackBright      10
		Density         9.49e-05
		Opacity         1e-06
		SelfShadow      0
		PlanetShadow    0
		Hapke           1
		SpotBright      3.05
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       1e+04
		densityScale    10
		densityOffset   0.84
		densityPower    10
		colorContrast   0
		FrontColor      (0.129 0.244 0.301)
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

