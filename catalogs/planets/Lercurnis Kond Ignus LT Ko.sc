Asteroid	"Ko/Lercurnis B V LT.1a"
{
	ParentBody     "Ko-Mo bar"
	Class          "Asteroid"
	Mass            1.04e-06
	Radius          80
	InertiaMoment   0.399
	RotationEpoch   1451545
	Obliquity       -326
	EqAscendNode    -3.77
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.827
		Randomize      (-0.036, 0.760, 0.069)
		colorDistMagn   0.242
		colorDistFreq   3.78
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.983
		icecapLatitude  2
		icecapHeight    0.544
		climatePole     0.438
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.152
		heightTempGrad  0.625
		beachWidth      0.000774
		tropicWidth     0.07
		mainFreq        0.367
		venusFreq       0.588
		venusMagn       0.562
		mareDensity     0
		terraceProb     0.146
		erosion         0
		montesMagn      0.495
		montesFreq      2.63
		montesSpiky     0.867
		montesFraction  0.639
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.8
		hillsFraction   0.685
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.248
		craterFreq      0.255
		craterDensity   0.878
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.573
		volcanoTemp     204
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

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0007
		SemiMajorAxis   6.26628995e-07
		Eccentricity    0.01
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

