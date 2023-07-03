Asteroid	"Mo/Lercurnis B V LT.1b"
{
	ParentBody     "Ko-Mo bar"
	Class          "Asteroid"
	Mass            8.3853e-07
	Radius          70
	InertiaMoment   0.39941
	RotationPeriod  202.01
	RotationEpoch   1451545
	Obliquity       360
	EqAscendNode    10.96

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.66802
		Randomize      (-0.253, 0.721, -0.995)
		colorDistMagn   0.60724
		colorDistFreq   1.2983
		detailScale     256
		drivenDarkening 0
		snowLevel       2
		tropicLatitude  0.79336
		icecapLatitude  2
		icecapHeight    0.84518
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.277
		heightTempGrad  0.625
		beachWidth      0.0016576
		tropicWidth     0.07
		mainFreq        0.5811
		venusFreq       0.74468
		venusMagn       0.86546
		mareDensity     0
		terraceProb     0.60146
		erosion         0
		montesMagn      0.62668
		montesFreq      3.3799
		montesSpiky     0.95998
		montesFraction  0.34423
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.346
		hillsFraction   0.72386
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25456
		craterFreq      0.21198
		craterDensity   0.87931
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51834
		volcanoTemp     287.22
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
		SemiMajorAxis   0.000243874607
		Eccentricity    0
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 0
		MeanAnomaly     180
	}
}

