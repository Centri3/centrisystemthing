Asteroid	"Ko/Lercurnis B V LT.1a"
{
	ParentBody     "Ko-Mo bar"
	Class          "Asteroid"
	Mass            1.0393e-06
	Radius          80
	InertiaMoment   0.39912
	RotationPeriod  207.3
	RotationEpoch   1451545
	Obliquity       -325.52
	EqAscendNode    -3.773

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.82658
		Randomize      (-0.036, 0.760, 0.069)
		colorDistMagn   0.24195
		colorDistFreq   3.7814
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.98302
		icecapLatitude  2
		icecapHeight    0.54435
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.15199
		heightTempGrad  0.625
		beachWidth      0.00077362
		tropicWidth     0.07
		mainFreq        0.36746
		venusFreq       0.58797
		venusMagn       0.56241
		mareDensity     0
		terraceProb     0.14569
		erosion         0
		montesMagn      0.49478
		montesFreq      2.6329
		montesSpiky     0.86675
		montesFraction  0.63853
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.803
		hillsFraction   0.68543
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2482
		craterFreq      0.25486
		craterDensity   0.87826
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57302
		volcanoTemp     203.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.001
		SemiMajorAxis   0.000243874597
		Eccentricity    0
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

