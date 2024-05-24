Moon	"Hec/Lercurnis B VII I"
{
	ParentBody     "Pel"
	Class          "Terra"
	Mass            0.165
	Radius          3.53e+03
	InertiaMoment   0.33
	Oblateness      0.0299
	Obliquity       0.01
	EqAscendNode    126
	TidalLocked     true

	Age				0.0077

	AlbedoBond      0.15
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_pel_hec.cfg"
		SurfStyle       0.655
		Randomize      (0.027, 0.509, -0.517)
		colorDistMagn   0.093
		colorDistFreq   339
		detailScale     128
		drivenDarkening 0
		seaLevel        0.237
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  2
		icecapHeight    0.487
		climatePole     1
		climateTropic   0.563
		climateEquator  0.563
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.105
		heightTempGrad  0.375
		beachWidth      0.00102
		tropicWidth     0.5
		mainFreq        1.14
		venusFreq       0.519
		venusMagn       0.344
		mareFreq        1
		mareDensity     1
		terraceProb     0.223
		erosion         0
		montesMagn      0.05
		montesFreq      150
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.0645
		dunesFreq       36.3
		dunesFraction   0.223
		hillsMagn       0.1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      25
		riversFreq      10
		riversSin       7
		riftsMagn       57.7
		riftsFreq       3.55
		riftsSin        5.71
		canyonsMagn     0.061
		canyonsFreq     76.4
		canyonsFraction 0
		cracksMagn      0
		cracksFreq      0
		cracksOctaves   0
		craterMagn      0.587
		craterFreq      5
		craterDensity   1
		craterOctaves   29
		volcanoMagn     0
		volcanoFreq     2
		volcanoDensity  1
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   1
		volcanoTemp     2.52e+03
		lavaCoverTidal  0.71
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.05
		stripeTwist     0.0791
		cycloneMagn     2.28
		cycloneFreq     0.539
		cycloneDensity  0.38
		cycloneOctaves  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      1.2
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          45
		Velocity        135
		BumpHeight      2.83
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateColor  (1.000 0.810 0.684)
		ModulateBright  0.3
		Opacity         0.366
		mainFreq        0.749
		mainOctaves     0
		Coverage        0.595
		stripeZones     1.05
		stripeTwist     0.0791
	}

	Clouds
	{
		Height          45
		Velocity        135
		BumpHeight      2.83
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateColor  (1.000 0.701 0.555)
		ModulateBright  0.4
		Opacity         0.458
		mainFreq        0.749
		mainOctaves     0
		Coverage        0.595
		stripeZones     1.05
		stripeTwist     0.0791
	}

	Clouds
	{
		Height          45
		Velocity        135
		BumpHeight      2.83
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.565
		mainFreq        0.749
		mainOctaves     0
		Coverage        0.595
		stripeZones     1.05
		stripeTwist     0.0791
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Pel Hec"
		Height          250
		Density         17.1
		Pressure        100
		Greenhouse      900
		Bright          7
		Opacity         1
		SkyLight        3.33
		Hue             0
		Saturation      2

		Composition
		{
			CO2       	99.6
			SO2       	0.41
			Ar        	9.31e-05
		}
	}

	Climate
	{
		GlobalWindSpeed  5
	}

	Aurora
	{
		Height         200
		NorthLat       90
		NorthLon       0
		NorthRadius    978
		NorthWidth     329
		NorthRings     5
		NorthBright    0.1
		NorthFlashFreq 7.82
		NorthMoveSpeed 100
		NorthParticles 100000
		SouthLat       -90
		SouthLon       180
		SouthRadius    978
		SouthWidth     329
		SouthRings     5
		SouthBright    0.1
		SouthFlashFreq 4.61
		SouthMoveSpeed 100
		SouthParticles 100000
		TopColor    (1.000 0.000 0.000)
		BottomColor (0.000 0.086 1.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.336825727
		SemiMajorAxisKm 149597.871
		Eccentricity    0.013
		Inclination     0.01
		AscendingNode   125.938222
		ArgOfPericenter 44.851533
		MeanAnomaly     124.607633
	}
}

