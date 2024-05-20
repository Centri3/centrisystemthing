DwarfMoon	"Le Fartherer/Lercurnis III XII"
{
	ParentBody     "Flank"
	Class          "Aquaria"
	Mass            1.7e-05
	Radius          200
	InertiaMoment   0.395
	RotationPeriod  317
	RotationEpoch   1451545
	Obliquity       0
	EqAscendNode    0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.609 0.523 0.323)

	Surface
	{
		Preset         "aquaria_airless_default.cfg"
		SurfStyle       0.00854
		Randomize      (0.918, 0.486, -0.826)
		colorDistMagn   0.0793
		colorDistFreq   23.6
		detailScale     512
		drivenDarkening 0.0232
		seaLevel        0.295
		snowLevel       2
		tropicLatitude  0.291
		icecapLatitude  0.76
		icecapHeight    0.0987
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.366
		heightTempGrad  0.625
		beachWidth      0.000518
		tropicWidth     0.07
		mainFreq        1.76
		venusFreq       1.42
		venusMagn       0.171
		mareFreq        0
		mareDensity     0.166
		terraceProb     0.185
		erosion         0
		montesMagn      0.0605
		montesFreq      11.9
		montesSpiky     0.951
		montesFraction  0.0436
		dunesMagn       0.0362
		dunesFreq       2.06
		dunesFraction   0.995
		hillsMagn       0.113
		hillsFreq       22
		hillsFraction   0.796
		hills2Fraction  0.215
		riversMagn      0
		riversFreq      2.93
		riversSin       6.04
		riftsMagn       0
		riftsFreq       3.93
		riftsSin        8.12
		canyonsMagn     0.507
		canyonsFreq     0.0767
		canyonsFraction 0
		cracksMagn      0.039
		cracksFreq      0.0811
		cracksOctaves   0
		craterMagn      1.33
		craterFreq      0.576
		craterDensity   0.9
		craterOctaves   15
		craterRayedFactor 0.147
		volcanoMagn     0.206
		volcanoFreq     0.582
		volcanoDensity  0.225
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.322
		volcanoRadius   0.148
		volcanoTemp     348
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
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
		PeriodDays      18262.1095
		SemiMajorAxisKm 58637051.4
		Eccentricity    0.458015267
		Inclination     13.740458
		AscendingNode   -90.6870229
		ArgOfPericenter -79.6946565
		MeanAnomaly     0
	}
}

