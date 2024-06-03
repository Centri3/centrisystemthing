Asteroid	"Mo/Lercurnis B V LT.1b"
{
	ParentBody     "Ko-Mo bar"
	Class          "Asteroid"
	Mass            8.39e-07
	Radius          70
	InertiaMoment   0.399
	RotationEpoch   1451545
	Obliquity       360
	EqAscendNode    11
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.668
		Randomize      (-0.253, 0.721, -0.995)
		colorDistMagn   0.607
		colorDistFreq   1.3
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.793
		icecapLatitude  2
		icecapHeight    0.845
		climatePole     0.438
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.277
		heightTempGrad  0.625
		beachWidth      0.00166
		tropicWidth     0.07
		mainFreq        0.581
		venusFreq       0.745
		venusMagn       0.865
		mareDensity     0
		terraceProb     0.601
		erosion         0
		montesMagn      0.627
		montesFreq      3.38
		montesSpiky     0.96
		montesFraction  0.344
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.3
		hillsFraction   0.724
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.255
		craterFreq      0.212
		craterDensity   0.879
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518
		volcanoTemp     287
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
		SemiMajorAxis   7.76668634e-07
		Eccentricity    0.01
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 0
		MeanAnomaly     180
	}
}

