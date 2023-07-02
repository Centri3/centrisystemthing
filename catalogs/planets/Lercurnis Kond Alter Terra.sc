Planet	"Alter Terra/Lercurnis B X"
{
	ParentBody     "Kond"
	Class          "Terra"
	Mass            1
	Radius          6378.14
	InertiaMoment   0.32973
	Oblateness      0.00335
	RotationPeriod  23.965536
	Obliquity       22.5
	EqAscendNode    150.8

	AlbedoBond      0.6
	AlbedoGeom      0.66
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
		Preset         "lercurnis_kond_alter_terra.cfg"
		SurfStyle       0.34053
		Randomize      (1.084, 1.145, -1.084)
		colorDistMagn   0.047039
		colorDistFreq   851.19
		detailScale     128
		drivenDarkening 0
		seaLevel        0.60305
		snowLevel       0.7
		tropicLatitude  0.65335
		icecapLatitude  0.65649
		icecapHeight    0.25
		climatePole     1
		climateTropic   1
		climateEquator  1
		climateSteppeMin -1
		climateSteppeMax 1
		climateForestMin -1
		climateForestMax 1
		climateGrassMin  -1
		climateGrassMax  1
		humidity        0.24427
		heightTempGrad  0
		beachWidth      0.0016704
		tropicWidth     0.07
		mainFreq        0.53435
		venusFreq       0.99237
		venusMagn       0.1145
		mareFreq        5.0179
		mareDensity     0
		terraceProb     0.10724
		erosion         0.12255
		montesMagn      0.1
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.047851
		dunesFreq       47.948
		dunesFraction   0.10469
		hillsMagn       0.91603
		hillsFreq       250
		hillsFraction   1
		hills2Fraction  1
		riversMagn      15
		riversFreq      7
		riversSin       7
		riftsMagn       100
		riftsFreq       2.5837
		riftsSin        6.1282
		canyonsMagn     0.032714
		canyonsFreq     163.55
		canyonsFraction 0.25129
		cracksMagn      0
		cracksFreq      1
		cracksOctaves   15
		craterMagn      3
		craterFreq      5
		craterDensity   1
		craterOctaves   30
		volcanoMagn     0
		volcanoFreq     0
		volcanoDensity  0
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.0471
		stripeTwist     0.079111
		cycloneMagn     2.872
		cycloneFreq     0.8246
		cycloneDensity  0.27541
		cycloneOctaves  0
		BumpHeight      20
		BumpOffset      2
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      1.414
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           12.061
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
		Height          15
		Velocity        134.78
		RotationOffset  15.115
		BumpHeight      2.8267
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.16794
		mainFreq        0.06
		mainOctaves     5
		Coverage        0.1374
		stripeZones     1.0471
		stripeTwist     0.079111
	}

	Clouds
	{
		Height          15
		Velocity        134.78
		BumpHeight      2.8267
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.22901
		mainFreq        0.06
		mainOctaves     5
		Coverage        0.1374
		stripeZones     1.0471
		stripeTwist     0.079111
	}

	Clouds
	{
		Height          15
		Velocity        134.78
		BumpHeight      2.8267
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.39695
		mainFreq        0.06
		mainOctaves     5
		Coverage        0.1374
		stripeZones     1.0471
		stripeTwist     0.079111
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Alter Terra"
		Height          100
		Density         1.2831
		Pressure        1
		Greenhouse      50
		Bright          7.5
		Opacity         1
		SkyLight        3.3333
		Hue             0
		Saturation      1

		Composition
		{
			N2        	87
			O2        	12.99
			CO2       	0.01
		}
	}

	Aurora
	{
		Height         78.796
		NorthLat       68.194
		NorthLon       126.02
		NorthRadius    1757.1
		NorthWidth     418.14
		NorthRings     3
		NorthBright    0.3
		NorthFlashFreq 76.994
		NorthMoveSpeed 0.72004
		NorthParticles 50000
		SouthLat       -53.929
		SouthLon       -66.106
		SouthRadius    1935.1
		SouthWidth     568.77
		SouthRings     2
		SouthBright    0.3
		SouthFlashFreq 65.339
		SouthMoveSpeed 0.93577
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
		Period          1.9045125
		SemiMajorAxis   0.662050131
		Eccentricity    0
		Inclination     0.408635667
		AscendingNode   139.630621
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

