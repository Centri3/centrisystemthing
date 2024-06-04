DwarfPlanet	"Goul/Lercurnis A IV"
{
	ParentBody     "Fragmunt"
	Class          "Aquaria"
	Mass            0.000277
	Radius          540
	InertiaMoment   0.399
	RotationPeriod  87.2
	RotationEpoch   1451545
	Obliquity       59.3
	EqAscendNode    -3.57

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.739 0.706 0.657)

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.952
		Randomize      (0.217, -0.823, -0.788)
		colorDistMagn   0.0721
		colorDistFreq   68.4
		detailScale     2.05e+03
		drivenDarkening 0
		seaLevel        0.141
		snowLevel       2
		tropicLatitude  0.86
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.405
		heightTempGrad  0.625
		beachWidth      0.000782
		tropicWidth     0.07
		mainFreq        1.79
		venusFreq       1.6
		venusMagn       0.197
		mareFreq        0
		mareDensity     0.168
		terraceProb     0.375
		erosion         0
		montesMagn      0.0772
		montesFreq      33.6
		montesSpiky     0.939
		montesFraction  0.247
		dunesMagn       0.0469
		dunesFreq       4.93
		dunesFraction   0.718
		hillsMagn       0.15
		hillsFreq       66.8
		hillsFraction   0.933
		hills2Fraction  0.176
		riversMagn      0
		riversFreq      3.58
		riversSin       6.05
		riftsMagn       0
		riftsFreq       3.44
		riftsSin        7.97
		canyonsMagn     0.51
		canyonsFreq     0.252
		canyonsFraction 0
		cracksMagn      0.043
		cracksFreq      0.289
		cracksOctaves   0
		craterMagn      0.531
		craterFreq      1.79
		craterDensity   0.783
		craterOctaves   17
		craterRayedFactor 0.162
		volcanoMagn     0.188
		volcanoFreq     0.847
		volcanoDensity  0.269
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.181
		volcanoRadius   0.166
		volcanoTemp     317
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
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
		Period          1.81279448
		SemiMajorAxis   1.3325273
		Eccentricity    0.320610687
		Inclination     2.7480916
		AscendingNode   -79.6946565
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

