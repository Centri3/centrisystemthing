DwarfMoon	"Blau/Lercurnis I II"
{
	ParentBody     "Verna-Luci bar"
	Class          "Asteroid"
	Mass            2.15e-05
	Radius          215
	InertiaMoment   0.399
	RotationPeriod  1.2e+03
	RotationEpoch   1451545
	Obliquity       8.24
	EqAscendNode    -101

	EndogenousHeating 1.32
	AlbedoBond      0.26
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_verna_blau.cfg"
		SurfStyle       0.252
		Randomize      (-0.687, 0.106, 0.321)
		colorDistMagn   0.262
		colorDistFreq   2.78
		detailScale     256
		drivenDarkening 0
		seaLevel        -0.382
		snowLevel       2
		tropicLatitude  0.518
		icecapLatitude  2
		icecapHeight    0.475
		climatePole     0.438
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.181
		heightTempGrad  0.625
		beachWidth      0.00119
		tropicWidth     0.07
		mainFreq        3.78
		venusFreq       1.85
		venusMagn       0.573
		mareDensity     0
		terraceProb     0.309
		erosion         0
		montesMagn      10
		montesFreq      2
		montesSpiky     1
		montesFraction  1
		dunesFraction   0
		hillsMagn       0.1
		hillsFreq       10
		hillsFraction   1
		hills2Fraction  1
		eqridgeMagn     0.1
		eqridgeWidth    1
		eqridgeModMagn  1.7
		eqridgeModFreq  5.8
		canyonsFraction 0
		craterMagn      0.03
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516
		volcanoTemp     1.15e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      30.8
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Gamma           0.9
		Hapke           0.244
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "None"
		Height          55
		Density         0
		Pressure        0
		Bright          0.5
		Opacity         0
		SkyLight        0.167
		Hue             0
		Saturation      1
	}

	Climate
	{
		GlobalWindSpeed  0
	}

	Aurora
	{
		Height         1
		NorthLat       90
		NorthLon       0
		NorthRadius    270
		NorthWidth     270
		NorthRings     10
		NorthBright    0.01
		NorthFlashFreq 8.24
		NorthMoveSpeed 6.44
		NorthParticles 29000
		SouthLat       -90
		SouthLon       180
		SouthRadius    270
		SouthWidth     270
		SouthRings     10
		SouthBright    0.03
		SouthFlashFreq 1
		SouthMoveSpeed 3.19
		SouthParticles 100000
		TopColor    (0.992 1.000 0.000)
		BottomColor (0.000 0.367 1.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      53.3977571
		SemiMajorAxisKm 1012476.27
		Eccentricity    0.0305343511
		Inclination     0
		AscendingNode   151.145038
		ArgOfPericenter 167.633588
		MeanAnomaly     -90.6870229
	}
}

